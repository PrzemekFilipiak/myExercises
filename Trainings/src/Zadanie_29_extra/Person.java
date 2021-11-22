package Zadanie_29_extra;

import java.time.LocalDate;

public class Person {
    String name;
    String surname;
    String pesel;
    LocalDate dateOfBirth;

    public Person(String name, String surname, String pesel, LocalDate dateOfBirth) {
        this.name = name;
        this.surname = surname;
        this.pesel = pesel;
        this.dateOfBirth = dateOfBirth;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ",\n pesel='" + pesel + '\'' +
                ",\n dateOfBirth=" + dateOfBirth +
                '}';
    }
}
