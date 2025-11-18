package main.java.ru.yandex.theatre.show;

import main.java.ru.yandex.theatre.person.Actor;
import main.java.ru.yandex.theatre.person.Director;
import main.java.ru.yandex.theatre.person.Person;

import java.util.ArrayList;

public class MusicalShow extends Show {
    private final Person musicAuthor;
    private final String librettoText;

    public MusicalShow(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText) {
        super(title, duration, director, listOfActors);
        this.musicAuthor = musicAuthor;
        this.librettoText = librettoText;
    }

    public void printLibrettoText() {
        System.out.println(librettoText + ".");
    }

    @Override
    public String toString() {
        return "Музыкальное шоу{" +
                "Автор музыки=" + musicAuthor +
                ", Лебретто текст='" + librettoText + '\'' +
                "} " + super.toString();
    }
}
