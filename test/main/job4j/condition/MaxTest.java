package main.job4j.condition;

import org.junit.Assert;
import org.junit.Test;
import ru.job4j.condition.Max;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.assertThat;
public class MaxTest {
    @Test
        public void whenMax1To2Then2() {
            int result = Max.max(1, 2);
            assertThat(result, is(2));
        }

    @Test
        public void whenLeftMaxThenLeft() {
            int result = Max.max(3, 2);
            int expected = 3;
            Assert.assertEquals(expected, result);
    }

    @Test
        public void whenRightMaxThenRight() {
            int result = Max.max(1, 2);
            int expected = 2;
            Assert.assertEquals(expected, result);
    }

    @Test
        public void whenLeftEqualsRightThenRight() {
            int result = Max.max(1, 1);
            int expected = 1;
            Assert.assertEquals(expected, result);
    }

    @Test
    public void maxFrom3() {
        int result = Max.max(0, 3, 2);
        int expected = 3;
        Assert.assertEquals(expected, result);
    }

    @Test
    public void maxFrom4() {
        int result = Max.max(4, 1, 2, 3);
        int expected = 4;
        Assert.assertEquals(expected, result);
    }
}
