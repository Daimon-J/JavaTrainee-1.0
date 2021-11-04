package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void When00To20Then2() {
        int x1 = 0;
        int y1 = 0;
        int x2 = 2;
        int y2 = 0;
        double expected = 2;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void When3312to33Then() {
        int x1 = 33;
        int y1 = 12;
        int x2 = 3;
        int y2 = 3;
        double expected = 31;
        double out = Point.distance(x1, y1, x2, y2);
        Assert.assertEquals(expected, out, 31);
    }
}