package TheatreClass.ShowClass;

import TheatreClass.PersonClass.Actor;
import TheatreClass.PersonClass.Director;

import java.util.ArrayList;

public class Show {
    private final String title;
    private final int duration;
    private final Director director;
    private final ArrayList<Actor> listOfActors;

    public Show(String title, int duration, Director director, ArrayList<Actor> listOfActors) {
        this.title = title;
        this.duration = duration;
        this.director = director;
        this.listOfActors = listOfActors;
    }


    public void addActor(Actor newActor) {
        for (Actor actor : listOfActors) {
            if (newActor.equals(actor)) {
                System.out.println("Такой актер уже добавлен.");
                return;
            }
        }

        listOfActors.add(newActor);
    }

    public void actorReplacement(Actor newActor, String surnameReplaceableActor) {
        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (surnameReplaceableActor.equals(actor.surname)) {
                listOfActors.remove(i);
                listOfActors.add(newActor);
                System.out.println("Актер заменен.");
                return;
            }
        }

        for (Actor actor : listOfActors) {
            if (!actor.surname.equals(surnameReplaceableActor)) {
                System.out.println("Актер с такой фамилией отсутствует, его нельзя заменить.");
                return;
            }
        }
    }

    public void printActorList() {
        for (Actor actor : listOfActors) {
            System.out.println("Фамилия: " + actor.surname + ".");
            System.out.println("Имя: " + actor.name + ". (рост: " + actor.height + ")");
        }
    }

    @Override
    public String toString() {
        return "Спектакль{" +
                "Название='" + title + '\'' +
                ", Продолжительность=" + duration +
                ", Режисер=" + director +
                ", Список актеров=" + listOfActors +
                '}';
    }
}
