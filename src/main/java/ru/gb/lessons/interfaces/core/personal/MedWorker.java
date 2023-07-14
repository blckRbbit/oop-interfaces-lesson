package Homework_2.src.main.java.ru.gb.lessons.interfaces.core.personal;

import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.clients.Human;
import Homework_2.src.main.java.ru.gb.lessons.interfaces.core.interfaces.Injectable;

public class MedWorker extends Human implements Injectable {
    public MedWorker(String fullName) {
        super(fullName);
    }

    @Override
    public void inject() {
        System.out.println("inject");
    }
}
