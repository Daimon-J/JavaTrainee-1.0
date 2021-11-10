package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class FindLoopTest {

    @Test
    public void whenArrayHas5Then0() {
        int[] date = {5, 4, 3, 2};
        int el = 5;
        int result = FindLoop.indexOf(date, el);
        int expected = 0;
        Assert.assertEquals(result, expected);
    }

    @Test
    public void whenArrayHas9Then1() {
        int[] date = {2, 9, 1, 1, 2};
        int el = 9;
        int result = FindLoop.indexOf(date, el);
        int expected = 1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenArrayHas9ThenNot() {
        int[] date = {2, 9, 1, 1, 2};
        int el = 22;
        int result = FindLoop.indexOf(date, el);
        int expected = -1;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void whenFind3() {
        int[] data = new int[] {5, 2, 10, 2, 4};
        int el = 2;
        int start = 2;
        int finish = 4;
        int result = FindLoop.indexOf(data, el, start, finish);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }
}