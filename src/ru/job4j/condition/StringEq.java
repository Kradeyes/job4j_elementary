package ru.job4j.condition;

public class StringEq {

    public static boolean check(String login) {
        String root = new String("root");
        if (login.equals(root)) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        String your = "your_name";
        boolean userHasAccess = StringEq.check(your);
        System.out.println(userHasAccess);
        String your2 = "root";
        boolean userHasAccess2 = StringEq.check(your2);
        System.out.println(userHasAccess2);
    }
}
