package main.java.ru.yandex.theatre;

import main.java.ru.yandex.theatre.enums.Gender;
import main.java.ru.yandex.theatre.person.Actor;
import main.java.ru.yandex.theatre.person.Director;
import main.java.ru.yandex.theatre.person.Person;
import main.java.ru.yandex.theatre.show.Ballet;
import main.java.ru.yandex.theatre.show.MusicalShow;
import main.java.ru.yandex.theatre.show.Opera;

import java.util.ArrayList;

public class Theatre {
    public static void main(String[] args) {
        Director operaDirector = new Director("Пётр", "Чайковский", Gender.MALE, 113);
        Director balletDirector = new Director("Мариус", "Петипа", Gender.MALE, 153);

        Actor firstActor = new Actor("Светлана", "Захарова", Gender.FEMALE, 170);
        Actor secondActor = new Actor("Ильдар", "Абдразаков", Gender.MALE, 185);
        Actor thirdActor = new Actor("Анна", "Нетребко", Gender.FEMALE, 165);
        Actor thirdTestActor = new Actor("Елена", "Нетребко", Gender.FEMALE, 175);

        Person musicAuthor = new Person("Пётр", "Чайковский", Gender.MALE);
        Person choreographer = new Person("Лев", "Иванов", Gender.MALE);

        ArrayList<Actor> musicalShowActors = new ArrayList<>();
        ArrayList<Actor> operaActors = new ArrayList<>();
        ArrayList<Actor> balletActors = new ArrayList<>();

        MusicalShow musicalShow = new MusicalShow("Русский фантом", 135, balletDirector, musicalShowActors, musicAuthor, "Либретто текст музыкольного шоу");
        musicalShow.addActor(firstActor);
        musicalShow.addActor(thirdActor);

        System.out.println();
        System.out.println();
        System.out.println("Список актеров для музыкального шоу:");
        musicalShow.printActorList();
        System.out.println();
        balletDirector.printDirectorInfo();
        System.out.println();
        System.out.println();


        Opera opera = new Opera("Евгений Онегин", 180, operaDirector, operaActors, musicAuthor, "Либретто текст оперы", 52);
        opera.addActor(firstActor);
        opera.addActor(secondActor);
        System.out.println("Список актеров для оперы:");
        opera.printActorList();
        System.out.println();
        System.out.println("Либретто оперы:");
        opera.printLibrettoText();
        System.out.println();
        operaDirector.printDirectorInfo();
        System.out.println();
        System.out.println();

        Ballet ballet = new Ballet("Лебединое озеро", 155, balletDirector, balletActors, musicAuthor, "Либретто текст балета", choreographer);
        ballet.addActor(secondActor);
        ballet.addActor(thirdActor);
        ballet.addActor(thirdTestActor);
        System.out.println("Список актеров для балета:");
        ballet.printActorList();
        System.out.println();
        System.out.println("Либретто балета:");
        ballet.printLibrettoText();
        System.out.println();
        balletDirector.printDirectorInfo();
        System.out.println();
        System.out.println();

        System.out.println("Замена существующего актера:");
        ballet.actorReplacement(firstActor, secondActor.getSurname());
        ballet.printActorList();
        System.out.println();
        System.out.println();

        System.out.println("Проверка актеров с одинаковыми фамилиями:");
        ballet.actorReplacement(secondActor, thirdActor.getSurname());
        ballet.printActorList();
        System.out.println();
        System.out.println();

        System.out.println("Замена несуществующего актера:");
        opera.actorReplacement(thirdActor, thirdActor.getSurname());
        System.out.println();
        System.out.println();
    }
}
