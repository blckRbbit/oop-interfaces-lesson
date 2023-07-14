package Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl;

import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.WildAnimal;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Flyable;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Soundable;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Swimable;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Runnable;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;

import java.time.LocalDate;

public class Duck extends WildAnimal implements Runnable, Soundable, Swimable, Flyable {
    private int flySpeed = 90;
    private int runSpeed = 5;
    private int swimSpeed = 5;
    String sound = "Quack!";

    public Duck() {
    }

    public Duck(int id, int numberOfLimbs, LocalDate registrationDate, Owner owner) {
        super(id, numberOfLimbs, registrationDate, owner);
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

    @Override
    public void fly() {
        System.out.println(CLASS_NAME + " flying at a speed of " + flySpeed + " km/h");
    }
}

