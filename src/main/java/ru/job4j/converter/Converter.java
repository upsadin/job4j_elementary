package ru.job4j.converter;

public class Converter {
    public static float rubleToEuro(float value) {
        float rsl = value / 70;
        return rsl;
    }

    public static float rubleToDollar(float value) {
        float rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        float in = 140;
        float expected = 2;
        float euro = Converter.rubleToEuro(in);
        boolean passed = euro == expected;
        System.out.println("140 rubles are 2. Test result is " + passed);
        in = 180;
        expected = 3;
        float dollar = Converter.rubleToDollar(in);
        passed = dollar == expected;
        System.out.println("180 rubles are 3. Test result is " + passed);
    }
}
