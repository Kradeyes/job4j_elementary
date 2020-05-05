package ru.job4j.condition;

import org.junit.Test;
import  org.junit.Assert;

public class PointTest {
    @Test
    public void when0020Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when2462Then4() {
        Point a = new Point(2, 4);
        Point b = new Point(6, 2);
        double expected = 4.47;
        double out = a.distance(b);
        Assert.assertEquals(expected, out, 0.01);
    }
}