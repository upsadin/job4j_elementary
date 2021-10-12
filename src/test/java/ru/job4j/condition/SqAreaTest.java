package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class SqAreaTest {

    @Test
    public void when6And2Then2() {
        double p = 6;
        double k = 2;
        double expected = 2;
        double result = SqArea.sqArea(p, k);
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void when5And1Then1point5625() {
        double p = 5;
        double k = 1;
        double expected = 1.5625;
        double result = SqArea.sqArea(p, k);
        Assert.assertEquals(result, expected, 0.01);
    }

    @Test
    public void when10And4Then4() {
        double p = 10;
        double k = 4;
        double expected = 4;
        double result = SqArea.sqArea(p, k);
        Assert.assertEquals(result, expected, 0.01);
    }
}