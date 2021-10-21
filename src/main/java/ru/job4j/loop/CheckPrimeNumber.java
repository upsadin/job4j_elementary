package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = number != 1;
        int index = 2;
        while (index < number) {
            if (number % index == 0) {
                prime = false;
                break;
            } else {
                index++;
            }
        }
        return prime;
    }
}
