package ru.job4j.calculate;

import org.junit.Assert;
import org.junit.Test;

public class FitTest {

    @Test
    public void whenMan180Then92() {
        short in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void whenWoman170Then69() {
        short in = 190;
        double expected = 103;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 103.0);
    }
}