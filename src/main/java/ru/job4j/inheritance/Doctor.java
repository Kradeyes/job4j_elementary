package ru.job4j.inheritance;

public class Doctor extends Profession {

    int patientsCount;

    @Override
    public String getName() {
        return super.getName();
    }

    public void patientExam() {
    }
}
