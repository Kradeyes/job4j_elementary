package ru.job4j.pojo;

public class College {
    public static void main(String[] args) {
        Student student = new Student();
        student.setName("Ivan");
        student.setSurname("Ivanov");
        student.setPatronymic("Ivanovich");
        student.setGroup(1);
        student.setDate("01.09.1993");
        System.out.println(student.getName() + " " + student.getSurname() + " " + student.getPatronymic() + " entered the group №" + student.getGroup() + " in " + student.getDate());
    }
}
