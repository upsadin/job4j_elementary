package ru.job4j.array;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Assert;

public class SimpleStringEncoderrTest {
    @Test
    public void whenStringaaabbcThenResulta3b2c() {
        String input = "aaabbc";
        String expected = "a3b2c";
        String result = SimpleStringEncoderr.encode(input);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenStringabbcccThenResulta2b3c() {
        String input = "abbccc";
        String expected = "ab2c3";
        String result = SimpleStringEncoderr.encode(input);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenStringaaabccThenResulta3bc2() {
        String input = "aaabcc";
        String expected = "a3bc2";
        String result = SimpleStringEncoderr.encode(input);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenStringabcThenResultabc() {
        String input = "abc";
        String expected = "abc";
        String result = SimpleStringEncoderr.encode(input);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenStringaaabbbcccThenResulta3b3c3() {
        String input = "aaabbbccc";
        String expected = "a3b3c3";
        String result = SimpleStringEncoderr.encode(input);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenStringaaaaaaaaaaaabbbcddddThenResulta12b3cd4() {
        String input = "aaaaaaaaaaaabbbcdddd";
        String expected = "a12b3cd4";
        String result = SimpleStringEncoderr.encode(input);
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenStringaaabbbbaaabbcccdddddThenResulta3b4a3b2c3d5() {
        String input = "aaabbbbaaabbcccddddd";
        String expected = "a3b4a3b2c3d5";
        String result = SimpleStringEncoderr.encode(input);
        Assert.assertEquals(result, expected);
    }
}