package ru.job4j.oop;

public class Jukebox {
    public void music(int position) {
        if (position == 1) {
            System.out.println("Спят усталые игрушки, книжки спят." + '\n' + "Одеяла и подушки ждут ребят...");
        } else if (position == 2) {
            System.out.println("Пусть бегут неуклюже" + '\n' + "Пешеходы по лужам....");
        } else {
            System.out.println("Песня не найдена");
        }
    }
    public static void main(String[] args) {
        Jukebox testdrive = new Jukebox();
        testdrive.music(1);
        System.out.println();
        testdrive.music(2);
        System.out.println();
        testdrive.music(3);
    }
}
