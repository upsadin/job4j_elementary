package ru.job4j.calculator;

public class Fit {
    public static double manWeight(short height) {
        double rs1 = (height - 100) * 1.15;
        return rs1;
    }

    public static double womanWeight(short height) {
        double rs1 = (height - 110) * 1.15;
        return rs1;
    }

    public static void main(String[] args) {
        short height1 = 187;
        double man = Fit.manWeight(height1);
        double woman = Fit.womanWeight(height1);
        System.out.println("Man 187 is " + man);
        System.out.println("Woman 187 is " + woman);
    }
}
