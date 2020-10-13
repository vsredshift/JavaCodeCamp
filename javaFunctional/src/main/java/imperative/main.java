package imperative;

import java.awt.*;

import static imperative.main.Gender.MALE;
import static imperative.main.String.name;

public class main {
    public static void main(String[] args) {
        List<Person> people = new List;(
            new Person(name: 'John', MALE);
            new Person(name: 'John', MALE);
            new Person(name: 'John', MALE);
            new Person(name: 'John', MALE);
            new Person(name: 'John', MALE);
            new Person(name: 'John', MALE);
        );
    }

    static class Person {
        private final String name;
        private final Gender gender;

        Person(String name, Gender gender) {
            this.name = name;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Person{" +
                    "name='" + name + '\'' +
                    ", gender=" + gender +
                    '}';
        }
    }

    enum Gender {
        MALE, FEMALE;
    }
}
