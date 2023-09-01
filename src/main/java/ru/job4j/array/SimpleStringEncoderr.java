package ru.job4j.array;

public class SimpleStringEncoderr {
    public static String encode(String input) {
        String result = "";
        char symbol = input.charAt(0);
        int counter = 1;
        for (int i = 1; i < input.length(); i++) {
            if (symbol == input.charAt(i)) {
                counter++;
            } else {
                result += Character.toString(symbol) + (counter == 1 ? "" : counter);
                symbol = input.charAt(i);
                counter = 1;
            }
        }
        result += Character.toString(symbol) + (counter == 1 ? "" : counter);
        return result;
    }
}
