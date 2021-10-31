package ru.job4j.array;

import ru.job4j.calculator.MathFunc;

public class Square {
    public static int[] calculate(int bound) {
        int[] rsl = new int[bound];
        for (int i = 0; i < bound; i++) {
            rsl[i] = i * i;
        }
        return rsl;
    }

    public static void main(String[] args) {
        for (int s : calculate(4)) {
            System.out.println(s);
        }
    }
}
