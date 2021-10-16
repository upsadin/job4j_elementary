package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class MaxTest {

    @Test
    public void when5and9then9() {
        int left = 5;
        int right = 9;
        int expected = 9;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when1045and9then1045() {
        int left = 1045;
        int right = 9;
        int expected = 1045;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }

    @Test
    public void when1and1then1() {
        int left = 1;
        int right = 1;
        int expected = 1;
        int out = Max.max(left, right);
        Assert.assertEquals(expected, out);
    }
}