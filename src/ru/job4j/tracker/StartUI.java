package ru.job4j.tracker;

import java.sql.SQLOutput;
import java.util.Scanner;

public class StartUI {


    public void init(Scanner scanner, Tracker tracker) {
        boolean run = true;
        while (run) {
            this.showMenu();
            System.out.print("Select: ");
            int input = Integer.valueOf(scanner.nextLine());
            if (input == 0) {
                System.out.println("=== Create a new Item ====");
                System.out.print("Enter name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                tracker.add(item);
             } else if (input == 1) {
                System.out.println("=== Show All ====");
                Item[] item = tracker.findAll();
                for (int i = 0; i < item.length; i++) {
                    System.out.println(item[i].toString());
                }
             } else if (input == 2) {
                System.out.println("=== Replace Item ====");
                System.out.println("Enter Id: ");
                String id = scanner.nextLine();
                System.out.println("Enter Name: ");
                String name = scanner.nextLine();
                Item item = new Item(name);
                if (tracker.replace(id, item)) {
                    System.out.println("Replace was successful");
                } else {
                    System.out.println("Replace failed");
                }
                } else if (input == 3) {
                System.out.println("=== Delete Item ====");
                System.out.println("Enter Id: ");
                String id = scanner.nextLine();
                if (tracker.delete(id)) {
                    System.out.println("Removal was successful");
                } else {
                    System.out.println("Removal failed");
                }
                } else if (input == 4) {
                System.out.println("=== Find by Id ====");
                System.out.println("Enter Id: ");
                Item item = tracker.findById(scanner.nextLine());
                if (item != null) {
                    System.out.println(item.toString());
                } else {
                    System.out.println("No application found");
                }
                } else if (input == 5) {
                System.out.println("=== Find by name ====");
                System.out.println("Enter name: ");
                Item[] item = tracker.findByName(scanner.nextLine());
                if (item.length != 0) {
                    for (int i = 0; i < item.length; i++) {
                        System.out.println(item[i].toString());
                    }
                } else {
                    System.out.println("No application found");
                }

                } else if (input == 6) {
                run = false;
            }
        }
    }

    private void showMenu() {
        System.out.println("Menu.");
        System.out.println("0. Add new Item");
        System.out.println("1. Show all items");
        System.out.println("2. Edit item");
        System.out.println("3. Delete item");
        System.out.println("4. Find item by Id");
        System.out.println("5. Find items by name");
        System.out.println("6. Exit Program");
    }


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Tracker tracker = new Tracker();
        new StartUI().init(scanner, tracker);
    }
}
