package ru.job4j.inheritance;

public class Tiger extends Predator {
    public Tiger() {
        super();
        System.out.println("Tiger");
    }

    public Tiger(String name) {
        super(name);
    }

    public static void main(String[] args) {
        Tiger tiger1 = new Tiger();
        System.out.println();
        Tiger tiger2 = new Tiger("Overloaded Tiger");
    }

}