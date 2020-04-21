package ru.job4j.converter;

/**
 *Convertation
 *
 * @author Roman Yanin (yanin.r.a@mail.ru)
 */
public class Converter {

    /**
     *
     * @param value Ruble
     * @return Euro
     */
    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    /**
     *
     * @param value Ruble
     * @return Dollar
     */
    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    /**
     *
     * @param args args
     */
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
