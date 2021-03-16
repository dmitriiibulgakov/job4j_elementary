package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int start = 5;
        int actual = Factorial.calc(start);
        int expected = 120;
        Assert.assertEquals(expected, actual);
    }

    @Test
    public void whenCalculateFactorialForZeroThenOne() {
        int start = 0;
        int actual = Factorial.calc(start);
        int expected = 1;
        Assert.assertEquals(expected, actual);
    }
}