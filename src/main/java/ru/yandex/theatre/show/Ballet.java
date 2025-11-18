package main.java.ru.yandex.theatre.show;

import main.java.ru.yandex.theatre.person.Actor;
import main.java.ru.yandex.theatre.person.Director;
import main.java.ru.yandex.theatre.person.Person;

import java.util.ArrayList;

public class Ballet extends MusicalShow {
    private final Person choreographer;

    public Ballet(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText, Person choreographer) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choreographer = choreographer;
    }

    @Override
    public String toString() {
        return "Балет{" +
                "Хореограф=" + choreographer +
                "} " + super.toString();
    }
}
