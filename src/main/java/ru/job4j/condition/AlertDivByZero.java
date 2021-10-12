package ru.job4j.condition;

public class AlertDivByZero {
    public static void possibleDiv(int number) {
        if (number == 0) {
            System.out.println("На ноль дельить нельзя");
        }
        if (number < 0) {
            System.out.println("Это отрицательное число");
        }
    }

    public static void main(String[] args) {
        possibleDiv(0);
        possibleDiv(-4);
    }
}
