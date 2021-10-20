package ru.job4j.condition;

public class MultipleSwitchWeek {
    public static int numberOfDay(String name) {
        return switch (name) {
            case "Понедельник", "Monday" -> 1;
            case "Вторник", "Tuesday" -> 2;
            case "Среда", "Wednesday" -> 3;
            case "Четверг", "Thursday" -> 4;
            case "Пятница", "Friday" -> 5;
            case "Суббота", "Saturday" -> 6;
            case "Воскресенье", "Sunday" -> 7;
            default -> -1;
        };
    }

    public static void main(String[] args) {
        System.out.println(MultipleSwitchWeek.numberOfDay("Monday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Вторник"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Wednesday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Четверг"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Friday"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Суббота"));
        System.out.println(MultipleSwitchWeek.numberOfDay("Sunday"));
    }
}
