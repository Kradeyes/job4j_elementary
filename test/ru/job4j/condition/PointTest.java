package ru.job4j.condition;

import org.junit.Test;
import  org.junit.Assert;

public class PointTest {

    @Test
    public void when0020Then2() {
        int inx1 = 0;
        int iny1 = 0;
        int inx2 = 2;
        int iny2 = 0;
        double expected = 2.0;
        double out = Point.distance(iny1, inx2, inx1, iny2);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void when2462Then4() {
        int inx1 = 2;
        int iny1 = 4;
        int inx2 = 6;
        int iny2 = 2;
        double expected = 4.47213595499958;
        double out = Point.distance(iny1, inx2, inx1, iny2);
        Assert.assertEquals(expected, out, 0.01);
    }
}