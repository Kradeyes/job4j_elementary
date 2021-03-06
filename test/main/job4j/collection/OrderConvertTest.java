package main.job4j.collection;

import org.junit.Test;
import ru.job4j.collection.Order;
import ru.job4j.collection.OrderConvert;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import static org.hamcrest.core.Is.is;
import static org.junit.Assert.*;

public class OrderConvertTest {
    @Test
    public void whenSingleOrder() {
        List<Order> orders = List.of(new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenFullDub() {
        List<Order> orders = List.of(new Order("3sfe", "Dress"),
                                     new Order("3sfe", "Dress"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Dress")));
    }

    @Test
    public void whenDubKey() {
        List<Order> orders = List.of(new Order("3sfe", "Dress"),
                                     new Order("3sfe", "Hat"));
        HashMap<String, Order> map = OrderConvert.process(orders);
        assertThat(map.get("3sfe"), is(new Order("3sfe", "Hat")));
    }
}