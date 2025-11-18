package TheatreClass.PersonClass;

import TheatreEnum.Gender;

import java.util.Objects;

public class Actor extends Person {
    public final int height;

    public Actor(String name, String surname, Gender gender, int height) {
        super(name, surname, gender);
        this.height = height;
    }

    @Override
    public boolean equals(Object o) {
        if (o == null || getClass() != o.getClass()) return false;
        if (!super.equals(o)) return false;
        Actor actor = (Actor) o;
        return Objects.equals(height, actor.height);
    }

    @Override
    public int hashCode() {
        return Objects.hash(super.hashCode(), height);
    }

    @Override
    public String toString() {
        return "Актер{" +
                "Рост=" + height +
                "} " + super.toString();
    }
}
