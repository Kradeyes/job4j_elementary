package ru.job4j.poly;

public class Bus implements Transport {

    @Override
    public void toGo() {
        System.out.println("Start of movement");
    }

    @Override
    public void passengers(int count) {
        System.out.println("Passengers count: " + count);
    }

    @Override
    public double fillUp(int count) {
        return count * 35.8;
    }
}
