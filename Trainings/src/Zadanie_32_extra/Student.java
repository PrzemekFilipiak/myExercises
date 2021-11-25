package Zadanie_32_extra;

import java.util.Arrays;

public class Student {
    int wiek;
    String imie;
    String nazwisko;
    int[] tabOcen;

    public Student(int wiek, String imie, String nazwisko, int[] tabOcen) {
        this.wiek = wiek;
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.tabOcen = tabOcen;
    }

    public int getWiek() {
        return wiek;
    }

    public int[] getTabOcen() {
        return tabOcen;
    }

    public double averageOcen(int[] tabOcen) {
        double sum = 0;
        for (int i = 0; i < tabOcen.length; i++) {
            sum += tabOcen[i];
        }
        return sum / (double) tabOcen.length;
    }

    @Override
    public String toString() {
        return "Student{" +
                "wiek=" + wiek +
                ", imie='" + imie + '\'' +
                ", nazwisko='" + nazwisko + '\'' +
                ", tabOcen=" + Arrays.toString(tabOcen) +
                '}';
    }
}
