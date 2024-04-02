package src.main.java.io.codelex.extra;

import java.io.IOException;
import java.math.BigInteger;
import java.net.URISyntaxException;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.*;

public class IBAN_Validator {
    private static final String FILE_IBAN_LENGHT = "src/main/java/io/codelex/extra/country_iban_lengths.txt";
    private static final Map<String, Integer> countryIBANLengths = new HashMap<>();
    private static final String FILE_IBAN_TO_CHECK = "src/main/java/io/codelex/extra/ibans_to_check.txt";
    private static final String FILE_COUNTRY_NAMES = "src/main/java/io/codelex/extra/countries_list";
    private static final Map<String, String> countryNames = new HashMap<>();
    private static final Charset charset = Charset.defaultCharset();

    public static void main(String[] args) throws IOException, URISyntaxException {

        List<String> ibans = readIBANList();
        for (String iban : ibans) {
            validateAndPrintResult(iban);
        }
    }

    private static void validateAndPrintResult(String iban) throws IOException {
        readCountryIBANLengthsFromFile();
        readCountryNamesFromFile();

        System.out.println("\nValidating IBAN: " + iban);

        String countryCode = iban.substring(0, 2);
        String countryName = countryNames.getOrDefault(countryCode, "Unknown");

        String validatedIBAN = iban;

        if (!validateIBANLength(validatedIBAN)) {
            System.out.println("IBAN length validation failed for country: " + countryName);
            return;
        }

        validatedIBAN = rearrangeFirstDigits(validatedIBAN);
        validatedIBAN = convertLettersToDigits(validatedIBAN);

        if (validateIBAN(validatedIBAN)) {
            System.out.println("IBAN digit test passed. IBAN is valid for country: " + countryName);
        } else {
            System.out.println("IBAN digit test failed. IBAN is not valid for country: " + countryName);
        }
    }

    private static void readCountryIBANLengthsFromFile() throws IOException {
        final Path path = Paths.get(FILE_IBAN_LENGHT);

        for (String line : Files.readAllLines(path, charset)) {
            String[] parts = line.split(",");
            if (parts.length == 2) {
                String countryCode = parts[0];
                int ibanLength = Integer.parseInt(parts[1]);
                countryIBANLengths.put(countryCode, ibanLength);
            }
        }
    }

    private static ArrayList<String> readIBANList() throws IOException {
        final Path path = Paths.get(FILE_IBAN_TO_CHECK);
        return new ArrayList<>(Files.readAllLines(path, charset));
    }

    private static void readCountryNamesFromFile() throws IOException {
        final Path path = Paths.get(FILE_COUNTRY_NAMES);
        for (String line : Files.readAllLines(path, charset)) {
            String[] parts = line.split(",");
            if (parts.length == 2) {
                String countryCode = parts[0];
                String countryName = parts[1];
                countryNames.put(countryCode, countryName);
            }
        }
    }

    private static boolean validateIBANLength(String iban) {
        String countryCode = iban.substring(0, 2);
        if (countryIBANLengths.containsKey(countryCode)) {
            int expectedLength = countryIBANLengths.get(countryCode);
            return iban.length() == expectedLength;
        }
        return false;
    }

    private static String rearrangeFirstDigits(String iban) {
        String firstFourChars = iban.substring(0, 4);
        String remainingChars = iban.substring(4);
        return remainingChars + firstFourChars;
    }

    private static String convertLettersToDigits(String iban) {
        StringBuilder convertedValue = new StringBuilder();
        for (char c : iban.toCharArray()) {
            if (Character.isLetter(c)) {
                int digitValue = AlphabetValue.valueOf(Character.toString(c)).getValue();
                convertedValue.append(digitValue);
            } else {
                convertedValue.append(c);
            }
        }
        return convertedValue.toString();
    }

    private static boolean validateIBAN(String iban) {
        BigInteger ibanInteger = new BigInteger(iban);
        BigInteger remainder = ibanInteger.remainder(BigInteger.valueOf(97));
        return remainder.equals(BigInteger.ONE);
    }

    private static String validateIBANLengthFromUserInput() {
        System.out.println("Enter IBAN to validate: ");
        Scanner scanner = new Scanner(System.in);
        String iban = scanner.nextLine().trim().replaceAll("\\s+", "");
        scanner.close();

        if (!validateIBANLength(iban)) {
            System.out.println("IBAN length is not valid.");
        }
        return iban;
    }
}