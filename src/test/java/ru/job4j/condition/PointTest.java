package ru.job4j.condition;

import org.junit.Test;
import org.junit.Assert;

public class PointTest {

    @Test
    public void when00to20then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double rs1 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(rs1, expected, 0.01);
    }

    @Test
    public void when11to20then1point4142135623730951() {
        int x1 = 1;
        int y1 = 1;
        int x2 = 2;
        int y2 = 0;
        double expected = 1.4142135623730951;
        double rs1 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(rs1, expected, 0.01);
    }

    @Test
    public void when12to24then2point23606797749979() {
        int x1 = 1;
        int y1 = 2;
        int x2 = 2;
        int y2 = 4;
        double expected = 2.23606797749979;
        double rs1 = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(rs1, expected, 0.01);
    }
}