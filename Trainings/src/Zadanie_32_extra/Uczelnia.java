package Zadanie_32_extra;
//Utwórz klasę Uczelnia, która będzie posiadała tablicę studentów. Każdy
//        student ma wiek, imię, nazwisko, tablicę z ocenami. Stwórz program,
//        który będzie sortował studentów:
//        a) wg wieku,
//        b) wg średniej ocen (klasa Student powinna mieć metodę do wyliczania
//        średniej).

import java.util.Arrays;

public class Uczelnia {
    public static void main(String[] args) {
        int[] tabA = {5, 4 ,3};
        int [] tabB = {2, 2, 3, 4, 3};
        int[] tabC = {3, 3};


        Student a = new Student(22, "Jan", "Kowalski", tabA);
        Student b = new Student(21, "Cris", "Kross", tabB);
        Student c = new Student(19, "Bill", "Watt", tabC);

        Student[] studentsArr = {a, b, c};
        a.averageOcen(a.getTabOcen());
        System.out.println(Arrays.toString(studentsArr));

        Student[] sA = new Student[studentsArr.length];
        for (int i = 0; i < studentsArr.length; i++) {  //Holds each Array element
            for (int j = i + 1; j < studentsArr.length; j++) {
                if (studentsArr[i].getWiek() > studentsArr[j].getWiek()) {
                    sA[0] = studentsArr[i];
                    studentsArr[i] = studentsArr[j];
                    studentsArr[j] = sA[0];
                }
            }
        }
        System.out.println(Arrays.toString(studentsArr));
        System.out.println(studentsArr[0].averageOcen(studentsArr[0].getTabOcen()));
        System.out.println(studentsArr[1].averageOcen(studentsArr[1].getTabOcen()));
        System.out.println(studentsArr[2].averageOcen(studentsArr[2].getTabOcen()));

        for (int i = 0; i < studentsArr.length; i++) {  //Holds each Array element
            for (int j = i + 1; j < studentsArr.length; j++) {
                if (studentsArr[i].averageOcen(studentsArr[i].getTabOcen()) > studentsArr[j].averageOcen(studentsArr[j].getTabOcen())) {
                    sA[0] = studentsArr[i];
                    studentsArr[i] = studentsArr[j];
                    studentsArr[j] = sA[0];
                }
            }
        }
        System.out.println(Arrays.toString(studentsArr));

    }
}
