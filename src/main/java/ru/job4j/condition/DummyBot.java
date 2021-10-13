package ru.job4j.condition;

public class DummyBot {
    public static String answer(String ask) {
        String rs1;
        if (ask.equals("Привет, бот.")) {
            rs1 = "Привет, умник.";
        } else {
            if (ask.equals("Пока.")) {
                rs1 = "До скорой встречи.";
            } else {
                rs1 = "Это ставит меня в тупик. Задайте другой вопрос.";
            }
        }
        return rs1;
    }

    public static void main(String[] args) {
        String rs1 = DummyBot.answer("Пока.");
        System.out.println(rs1);
    }
}
