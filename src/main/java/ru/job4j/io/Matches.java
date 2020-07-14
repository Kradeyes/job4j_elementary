package ru.job4j.io;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class Matches {
    public static void main(String[] args) {
        int value = 11;
        int numberOfMoves = 0;
        Scanner scanner = new Scanner(System.in);
        while (value > 0) {
                System.out.println("Возьмите от 1 до 3 спичек");
                int pickUp = Integer.valueOf(scanner.nextLine());
                numberOfMoves++;
                value -= pickUp;
                System.out.println("Осталось спичек: " + value);
                }
        if (numberOfMoves % 2 != 0) {
            System.out.println("Победил 1 игрок");
        } else {
            System.out.println("Победил 2 игрок");
        }
    }
    }

