package ru.job4j.condition;

public class SqArea {

    public static double sqArea(double p, double k) {
    double rs1 = Math.pow(p / (2 * (k + 1)), 2) * k;
    return rs1;
    }

    public static void main(String[] args) {
        double p = 6;
        double k = 2;
        double result = SqArea.sqArea(p, k);
        System.out.println("p = " + p + ", k = " + k + ", area = " + result);
    }
}
