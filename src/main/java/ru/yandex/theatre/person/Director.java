package main.java.ru.yandex.theatre.person;

import main.java.ru.yandex.theatre.enums.Gender;

public class Director extends Person {
    private final int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void printDirectorInfo() {
        System.out.println("Информация о режисере.");
        System.out.println("Фамилия: " + super.getSurname() + ".");
        System.out.println("Имя: " + super.getName() + ".");
    }

    @Override
    public String toString() {
        return "Режисер{" +
                "Количество постановок=" + numberOfShows +
                "} " + super.toString();
    }
}
