package Homework_2.src.main.java.ru.gb.lessons.interfaces.core.personal;

import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Diagnosable;

import java.sql.SQLOutput;

public class Doctor extends MedWorker implements Diagnosable {
    public Doctor(String fullName) {
        super(fullName);
    }

    @Override
    public void diagnose() {
        System.out.println("It's lupus!");
    }

}
