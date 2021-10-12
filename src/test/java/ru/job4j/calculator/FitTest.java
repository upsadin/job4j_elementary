package ru.job4j.calculator;

import org.junit.Test;
import org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180then92() {
        short in = 180;
        double expected = 92;
        double rs1 = Fit.manWeight(in);
        Assert.assertEquals(rs1, expected, 0.01);
    }

    @Test
    public void whenWoman170then69() {
        short in = 170;
        double expected = 69;
        double rs1 = Fit.womanWeight(in);
        Assert.assertEquals(rs1, expected, 0.01);
    }
}