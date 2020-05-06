package ru.job4j.pojo;

public class Library {
    public static void main(String[] args) {
        Book first = new Book("War and Peace", 2000);
        Book second = new Book("The Fisherman and His Soul", 500);
        Book third = new Book("Dracula", 1000);
        Book fourth = new Book("Clean Code", 999);
        Book[] library = new Book[4];
        library[0] = first;
        library[1] = second;
        library[2] = third;
        library[3] = fourth;

        for (Book x : library) {
            System.out.println(x.getName() + " " + x.getPages());
        }

        Book tmp = library[0];
        library[0] = library[3];
        library[3] = tmp;
        System.out.println();

        for (Book x : library) {
            System.out.println(x.getName() + " " + x.getPages());
        }
        System.out.println();

        for (Book x : library) {
            if (x.getName().equals("Clean Code")) {
                System.out.println(x.getName() + " " + x.getPages());
            }
        }
    }
}