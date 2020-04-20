package ru.job4j.calculator;
import org.junit.Test;
import  org.junit.Assert;

public class FitTest {

    @Test
    public void whenMan180HeightThen92() {
        double in = 180;
        double expected = 92;
        double out = Fit.manWeight(in);
        Assert.assertEquals(expected, out, 0.01);

    }

    @Test
    public void whenWoman160HeightThen46() {
        double in = 160;
        double expected = 57.49999999999999;
        double out = Fit.womanWeight(in);
        Assert.assertEquals(expected, out, 0.01);
    }
}