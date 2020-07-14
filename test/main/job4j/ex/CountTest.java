package main.job4j.ex;

import org.junit.Test;
import ru.job4j.ex.Count;

public class CountTest {

    @Test(expected = IllegalArgumentException.class)
    public void whenStartGreaterThenFinish() {
        Count.add(10, 2);
    }
}