package Homework_2.src.main.java.ru.gb.lessons.interfaces;

import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animal;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl.Cat;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl.Dog;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.home.impl.Owl;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.owners.Owner;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl.Duck;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.VetClinic;

import java.time.LocalDate;

/**
 Небольшая шпаргалка по синтаксису java:

 1) Названия классов в java - существительные с большой буквы верблюжьей нотацией: CamelCase;
 2) названия методов - отглагольные, с маленькой буквы, верблюжьей нотацией: getUserById;
 3) Названия переменных - существительные с маленькой буквы, верблюжьей нотацией: maxCount;
 4) названия пакетов в java существительные, всегда с маленькой буквы и в одно слово;
 -! Если логика классов внутри пакета не позволяет назвать все в одно существительное, надо вложить один пакет в другой.
 */
public class Main {
    public static void main(String[] args) {
        VetClinic Friends = new VetClinic();

        Cat homeCat = new Cat(2, "Salem", 4, LocalDate.of(2022, 4, 13), new Owner("Sabrina Spellman"));
        Dog homeDog = new Dog(3, "Hachiko", 4, LocalDate.of(2023, 1, 15), new Owner("Hidesaburō Ueno"));
        Owl homeOwl = new Owl(4, "Hedwig", 4, LocalDate.of(2022, 7, 23), new Owner("Harry Potter"));

        Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl.Cat wildCat =
                new Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.wild.impl.Cat(
                        1, 4, LocalDate.of(2023, 1, 5), new Owner("incognito"));
        Duck wildDuck = new Duck(5, 4, LocalDate.of(2023, 2, 17), new Owner("incognito"));


        System.out.printf("getAllAnimals(): %s%n", Friends.getAllAnimals());
        System.out.printf("getRunningAnimals(): %s%n", Friends.getRunningAnimals());
        System.out.printf("getSwimmingAnimals(): %s%n", Friends.getSwimmingAnimals());
        System.out.printf("getSpeakingAnimals(): %s%n", Friends.getSpeakingAnimals());
        System.out.printf("getFlyingAnimals(): %s%n", Friends.getFlyingAnimals());

      System.out.println(homeCat);
        homeDog.groundMove();
        homeDog.sound();
        homeOwl.fly();
        homeOwl.sound();
        homeCat.groundMove();
        wildCat.groundMove();
        homeCat.sound();
        wildCat.sound();
        wildDuck.sound();
        wildDuck.fly();

    }
}
