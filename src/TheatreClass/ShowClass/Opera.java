package TheatreClass.ShowClass;

import TheatreClass.PersonClass.Actor;
import TheatreClass.PersonClass.Director;
import TheatreClass.PersonClass.Person;

import java.util.ArrayList;

public class Opera extends MusicalShow {
    private final int choirSize;

    public Opera(String title, int duration, Director director, ArrayList<Actor> listOfActors, Person musicAuthor, String librettoText, int choirSize) {
        super(title, duration, director, listOfActors, musicAuthor, librettoText);
        this.choirSize = choirSize;
    }

    @Override
    public String toString() {
        return "Опера{" +
                "Размер хора=" + choirSize +
                "} " + super.toString();
    }
}
