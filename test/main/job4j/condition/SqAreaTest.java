package main.job4j.condition;

import org.junit.Test;
import  org.junit.Assert;
import ru.job4j.condition.SqArea;

public class SqAreaTest {
    @Test
    public void when41Then1() {
    int inp = 4;
    int ink = 1;
    double expected = 1.0;
    double out = SqArea.square(inp, ink);
    Assert.assertEquals(expected, out, 0.01);
    }

    @Test
    public void when62Then2() {
        int inp = 6;
        int ink = 2;
        double expected = 2.0;
        double out = SqArea.square(inp, ink);
        Assert.assertEquals(expected, out, 0.01);
    }
}