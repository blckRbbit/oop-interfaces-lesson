package Homework_2.src.main.java.ru.gb.lessons.interfaces.core;
import java.util.ArrayList;
import java.util.List;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.*;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Animal;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.*;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Runnable;

public class VetClinic {
    private List<Animal> animals;
    public VetClinic(Human headPhysician) {
        this.animals = new ArrayList<>();
    }
    public VetClinic() {this(null);}
    public void addAnimal(Animal animal) {
        animals.add((Animal) animal);
    }
    public List<Animal> getAllAnimals() { return animals; }

    public List<Swimable> getSwimmingAnimals() {
        List<Swimable> swimmingAnimals = new ArrayList<>();

        for (Animal element: animals)
            if (element instanceof Swimable) swimmingAnimals.add((Swimable) element);

        return swimmingAnimals;
    }
    public List<Runnable> getRunningAnimals() {
        List<Runnable> runningAnimals = new ArrayList<>();

        for (Animal element: animals)
            if (element instanceof Runnable) runningAnimals.add((Runnable) element);

        return runningAnimals;
    }

    public List<Flyable> getFlyingAnimals() {
        List<Flyable> flyingAnimals = new ArrayList<>();

        for (Animal element: animals)
            if (element instanceof Flyable) flyingAnimals.add((Flyable) element);

        return flyingAnimals;
    }

    public List<Soundable> getSpeakingAnimals() {
        List<Soundable> speakingAnimals = new ArrayList<>();

        for (Animal element: animals)
            if (element instanceof Soundable) speakingAnimals.add((Soundable) element);

        return speakingAnimals;
    }
}
