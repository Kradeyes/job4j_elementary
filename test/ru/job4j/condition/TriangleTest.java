package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;


public class TriangleTest {
    @Test
    public void whenExist() {
        Point p1 = new Point(0, 0);
        Point p2 = new Point(0, 2);
        Point p3 = new Point(2, 0);
        Triangle tri = new Triangle(p1, p2, p3);
        double ex = 1.9;
        double out = tri.area();
        Assert.assertEquals(ex, out, 0.1);
    }

}