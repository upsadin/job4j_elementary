package ru.job4j.condition;

public class Point {
    public static double distance(int x1, int y1, int x2, int y2) {
        double rs1 = Math.sqrt(Math.pow((x2 - x1), 2) + Math.pow((y2 - y1), 2));
        return rs1;
    }

    public static void main(String[] args) {
        int x1 = 1;
        int y1 = 2;
        int x2 = 3;
        int y2 = 4;
        double result = Point.distance(x1, y1, x2, y2);
        System.out.println("Result (" + x1 + "," + y1 + ") to (" + x2 + "," + y2 + ") is " + result);
    }
}
