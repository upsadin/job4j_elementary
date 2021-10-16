package ru.job4j.condition;

public class Games {
    public static void permission(boolean allowByParent, boolean hasMoney) {
//           boolean can = allowByParent && hasMoney;
        if (allowByParent && hasMoney) {
            System.out.println("You can go to the club");
        } else {
            System.out.println("You can't go");
        }
    }

    public static void main(String[] args) {
        Games.permission(true, true);
        Games.permission(true, false);
        Games.permission(false, true);
        Games.permission(false, false);
    }
}
