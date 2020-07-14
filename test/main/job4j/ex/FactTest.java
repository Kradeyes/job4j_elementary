package main.job4j.ex;

import org.junit.Test;
import ru.job4j.ex.Fact;

public class FactTest {

    @Test(expected = IllegalArgumentException.class)
    public void calc() {
        Fact.calc(-2);
    }
}