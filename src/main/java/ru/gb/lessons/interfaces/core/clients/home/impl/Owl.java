package Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl;

import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.Pet;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Flyable;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Soundable;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Runnable;
import java.time.LocalDate;

public class Owl extends Pet implements Soundable, Flyable, Runnable {
    private int flySpeed = 80;
    private int runSpeed = 5;
    private String sound = "Hoot!";

    public Owl() {
    }

    public Owl(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, name, numberOfLimbs, registrationDate, owner);
    }
    @Override
    public void sound() {
        System.out.println(sound);
    }

    @Override
    public void groundMove() {
        System.out.println(CLASS_NAME + " running at a speed of " + runSpeed + " km/h");
    }

    @Override
    public void fly() {
        System.out.println(CLASS_NAME + " flying at a speed of " + flySpeed + " km/h");
    }
}
