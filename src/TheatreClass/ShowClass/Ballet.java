package TheatreClass.ShowClass;

import TheatreClass.PersonClass.Actor;
import TheatreClass.PersonClass.Director;
import TheatreClass.PersonClass.Person;

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
