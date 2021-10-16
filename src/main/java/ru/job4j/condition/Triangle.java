package ru.job4j.condition;

public class Triangle {
    public static boolean exist(double ab, double bc, double ac) {
        return ab + bc > ac && ac + bc > ab && ab + ac > bc;
    }

    public static void main(String[] args) {
        System.out.println(Triangle.exist(3, 4, 5));
    }
}
