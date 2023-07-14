package Homework_2.src.main.java.ru.gb.lessons.interfaces.core.personal;

import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Careable;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Cleanable;

public class Nurse extends MedWorker implements Careable, Cleanable {
    public Nurse(String fullName) {
        super(fullName);
    }

    @Override
    public void care() {
        System.out.println("Good boy! Take a meal.");
    }

    @Override
    public void clean() {
        System.out.println("Clean the room.");
    }
}
