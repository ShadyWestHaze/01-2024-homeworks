package io.codelex.Extra.Dictionary;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.nio.charset.StandardCharsets;
import java.util.Scanner;

public class Dictionary {
    public static void main(String[] args) {
        String baseUrl = "https://api.dictionaryapi.dev/api/v2/entries/en/";
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("\nType a word or type 'exit' to quit)");
            String userInput = scanner.nextLine();

            if (userInput.equalsIgnoreCase("exit")) {
                break;
            }

            String apiUrl = baseUrl + userInput;

            try {
                String jsonData = fetchJsonData(apiUrl);

                JSONArray jsonArray = new JSONArray(jsonData);
                JSONObject jsonObject = jsonArray.getJSONObject(0);

                String word = jsonObject.getString("word");
                System.out.println("\nWord: " + word);

                JSONArray meanings = jsonObject.getJSONArray("meanings");
                for (int i = 0; i < 1; i++) {

                    JSONObject meaning = meanings.getJSONObject(i);

                    JSONArray definitions = meaning.getJSONArray("definitions");
                    for (int j = 0; j < definitions.length(); j++) {
                        if (j < 3) {
                            JSONObject definition = definitions.getJSONObject(j);
                            String def = definition.getString("definition");
                            System.out.println("Definition[" + j + "]: " + def);
                        }
                    }
                }

            } catch (FileNotFoundException e) {
                System.out.println("The word could not be found ...try another word");
            } catch (IOException | JSONException e) {
                e.printStackTrace();
            }
        }
        scanner.close();
    }

    private static String fetchJsonData(String apiUrl) throws IOException {
        URL url = new URL(apiUrl);
        InputStream inputStream = url.openStream();
        Scanner scanner = new Scanner(inputStream, StandardCharsets.UTF_8).useDelimiter("\\A");
        String jsonData = scanner.hasNext() ? scanner.next() : "";
        scanner.close();
        return jsonData;


    }
}
