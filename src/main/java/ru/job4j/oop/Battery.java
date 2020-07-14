package ru.job4j.oop;

public class Battery {
    private int load;

    public Battery(int load) {
        this.load = load;
    }
    public void exchange(Battery another) {
    another.load += this.load;
    this.load = 0;
    }

    public static void main(String[] args) {
        Battery firstBattery = new Battery(10);
        Battery secondBattery = new Battery(5);
        firstBattery.exchange(secondBattery);
        System.out.println("Load of first battery is " + firstBattery.load + " ,load of second battery is " + secondBattery.load);
    }
}
