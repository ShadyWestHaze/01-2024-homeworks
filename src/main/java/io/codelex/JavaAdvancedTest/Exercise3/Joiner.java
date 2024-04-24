package io.codelex.JavaAdvancedTest.Exercise3;

public class Joiner<T> {
    private final String separator;

    public Joiner(String separator) {
        this.separator = separator;
    }

    public String join(T... elements) {
        StringBuilder finalString = new StringBuilder();
        for (int i = 0; i < elements.length; i++) {
            finalString.append(elements[i]);
            if (i < elements.length - 1) {
                finalString.append(separator);
            }
        }
        return finalString.toString();
    }

    public static void main(String[] args) {
        Joiner<Integer> joiner = new Joiner<>("-");
        System.out.println(joiner.join(1, 2, 3, 4, 5));

        Joiner<String> stringJoiner = new Joiner<>(" ");
        System.out.println(stringJoiner.join("Hello", "world", "from", "Joiner"));
    }
}
