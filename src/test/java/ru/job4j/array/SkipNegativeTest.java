package ru.job4j.array;

import org.junit.Assert;
import org.junit.Test;

public class SkipNegativeTest {
    @Test
    public void whenArrayRowAndColumnEquals() {
        int[][] array = {{1, -2}, {1, 2}};
        int[][] result = SkipNegative.skip(array);
        int[][] expected = {{1, 0}, {1, 2}};
        Assert.assertArrayEquals(expected, result);
    }
}