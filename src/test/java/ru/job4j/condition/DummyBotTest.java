package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class DummyBotTest {

    @Test
    public void whenHelloThenHello() {
        String in = "Привет, бот.";
        String expected = "Привет, умник.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenByeThenBye() {
        String in = "Пока.";
        String expected = "До скорой встречи.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(out, expected);
    }

    @Test
    public void whenUnknowThenUnknow() {
        String in = "Как дела?";
        String expected = "Это ставит меня в тупик. Задайте другой вопрос.";
        String out = DummyBot.answer(in);
        Assert.assertEquals(out, expected);
    }
}