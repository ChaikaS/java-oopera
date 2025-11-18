package TheatreClass.PersonClass;

import TheatreEnum.Gender;

public class Director extends Person {
    private final int numberOfShows;

    public Director(String name, String surname, Gender gender, int numberOfShows) {
        super(name, surname, gender);
        this.numberOfShows = numberOfShows;
    }

    public void printDirectorInfo() {
        System.out.println("Информация о режисере.");
        System.out.println("Фамилия: " + super.surname + ".");
        System.out.println("Имя: " + super.name + ".");
    }

    @Override
    public String toString() {
        return "Режисер{" +
                "Количество постановок=" + numberOfShows +
                "} " + super.toString();
    }
}
