package ru.job4j.inheritance;

public class Dentist extends Doctor {

    int inspectedTeethCount;

    @Override
    public String getName() {
        return super.getName();
    }

    @Override
    public void patientExam() {
        super.patientExam();
    }

    public void pullOutATeeth() {
    }

}
