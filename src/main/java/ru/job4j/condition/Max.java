package ru.job4j.condition;

public class Max {
    public static int max(int left, int right) {
        int rel = left > right ? left : right;
        return rel;
    }

    public static void main(String[] args) {
        int result = Max.max(5, 4);
        System.out.println("Maximum is " + result);
    }
}
