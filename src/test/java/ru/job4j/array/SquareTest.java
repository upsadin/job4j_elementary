package ru.job4j.array;

import org.junit.Test;

import org.junit.Assert;

public class SquareTest {

    @Test
    public void whenBound3Then014() {
        int bound = 3;
        int[] expected = new int[] {0, 1, 4};
        int[] rsl = Square.calculate(bound);
        Assert.assertArrayEquals(expected, rsl);
    }

    @Test
    public void whenBound5Then014916() {
        int bound = 5;
        int[] expected = new int[] {0, 1, 4, 9, 16};
        int[] rsl = Square.calculate(bound);
        Assert.assertArrayEquals(expected, rsl);
    }
}