package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.name = "Ivan";
        student.surname = "Ivanov";
        student.patronymic = "Ivanovich";
        student.group = 1;
        student.date = "01.09.1993";
        System.out.println(student.getName() + " " + student.getSurname() + " " + student.getPatronymic() + " entered the group №" + student.getGroup() + " in " + student.getDate());
    }
}
