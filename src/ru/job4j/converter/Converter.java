package ru.job4j.converter;

public class Converter {
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int inforeuro = 140;
        int infordollar = 120;
        int expectedeuro = 2;
        int expecteddollar = 2;
        int outeuro = Converter.rubleToEuro(inforeuro);
        int outdollar = Converter.rubleToDollar(infordollar);
        boolean passedeuro = expectedeuro == outeuro;
        boolean passeddollar = expecteddollar == outdollar;
        System.out.println("140 rubles are 2. Test result:" + passedeuro);
        System.out.println("120 rubles are 2. Test result:" + passeddollar);
    }
}
