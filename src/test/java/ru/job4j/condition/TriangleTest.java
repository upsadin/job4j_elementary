package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class TriangleTest {

    @Test
    public void when234thenTrue() {
        double ab = 2;
        double bc = 3;
        double ac = 4;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertTrue(result);
    }

    @Test
    public void when2315thenTrue() {
        double ab = 2;
        double bc = 3;
        double ac = 15;
        boolean result = Triangle.exist(ab, bc, ac);
        Assert.assertFalse(result);
    }
}