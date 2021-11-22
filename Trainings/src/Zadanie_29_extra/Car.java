package Zadanie_29_extra;

import java.time.LocalDate;

public class Car {
    String brand;
    String model;
    LocalDate yearOfProduction;
    String engineCapacity;
    String type;
    Person owner;

    public Car(String brand, String model, LocalDate yearOfProduction, String engineCapacity, String type, Person owner) {
        this.brand = brand;
        this.model = model;
        this.yearOfProduction = yearOfProduction;
        this.engineCapacity = engineCapacity;
        this.type = type;
        this.owner = owner;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ",\n model='" + model + '\'' +
                ",\n yearOfProduction=" + yearOfProduction.getYear() +
                ",\n engineCapacity='" + engineCapacity + '\'' +
                ",\n type='" + type + '\'' +
                ",\n owner=" + owner +
                '}';
    }
}
