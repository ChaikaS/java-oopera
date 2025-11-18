package main.java.ru.yandex.theatre.show;

import main.java.ru.yandex.theatre.person.Actor;
import main.java.ru.yandex.theatre.person.Director;

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
        boolean isFoundActor = false;
        int foundIndex = -1;

        for (int i = 0; i < listOfActors.size(); i++) {
            Actor actor = listOfActors.get(i);
            if (surnameReplaceableActor.equals(actor.getSurname())) {
                if (isFoundActor) {
                    System.out.println("Найдено несколько актеров с фамилией " + surnameReplaceableActor + ". Замена не выполнена");
                    return;
                }
                foundIndex = i;
                isFoundActor = true;
            }
        }

        if (!isFoundActor) {
            System.out.println("Актер с такой фамилией отсутствует, его нельзя заменить.");
        } else {
            listOfActors.remove(foundIndex);
            listOfActors.add(newActor);
            System.out.println("Актер заменен.");
        }
    }

    public void printActorList() {
        for (Actor actor : listOfActors) {
            System.out.println(actor.toString());
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
