package ru.job4j.condition;

public class DummyBot {
    public static String answer(String ask) {
        String rsl = "Это ставит меня в тупик. Задайте другой вопрос.";
            if ("Привет, бот.".equals(ask)) {
            rsl = "Привет, умник.";
        } else if ("Пока.".equals(ask)) {
                rsl = "До скорой встречи.";
        }
        return rsl;
    }

    public static void main(String[] args) {
        String result = DummyBot.answer("Пока.");
        System.out.println(result);
    }
}
