package ru.job4j.loop;

import org.junit.Assert;
import org.junit.Test;

public class FactorialTest {
    @Test
    public void whenCalculateFactorialForFiveThenOneHundredTwenty() {
        int n = 5;
        int calc = Factorial.calc(n);
        int expected = 120;
        Assert.assertEquals(expected, calc);
    }
}