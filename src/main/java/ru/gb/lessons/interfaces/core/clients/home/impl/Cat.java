package Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl;

import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Soundable;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.Pet;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Swimable;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Runnable;
import java.time.LocalDate;

/**
 * Одна из реализаций домашнего животного
 */
public class Cat extends Pet implements Runnable, Swimable, Soundable {
    private int runSpeed = 13;
    private int swimSpeed = 5;
    private String sound = "Meow!";
    public Cat() {
    }

    public Cat(int id, String name, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
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
    public void swim() {
        System.out.println(CLASS_NAME + " swimming at a speed of " + swimSpeed + " km/h");
    }
}


