package Zadanie_24_extra;

import java.util.Scanner;

//Napisz program który zaprezentuje n elementów ciągu arytmetycznego.
//        Użytkownik podaje pierwszy wyraz ciągu, różnicę ciągu arytmetycznego
//        oraz liczbę n (ile elementów tego ciągu chcemy zaprezentować).
//        W oddzielnej metodzie wyświetl kolejne elementy ciągu
//        geometrycznego. Użytkownik podaje pierwszy wyraz oraz iloraz.
//        Policz sumę elementów dla każdego rodzaju ciągu.
public class Ex4_ciagi {
    public static void main(String[] args) {
        // arithmetic string
        System.out.println("Podaj pierwszy wyraz");
        int afirst = getIntNumberFromUser();
        System.out.println("Podaj różnicę");
        int rDifference = getIntNumberFromUser();
        System.out.println("Podaj ilośc elementów do wyświetlenia");
        int nAmount = getIntNumberFromUser();

        System.out.println("Kolejne elementy");
        displayElements(afirst, rDifference, nAmount);
        System.out.println("suma ciagu");
        displaySum(afirst, rDifference, nAmount);
    // geometric string
        System.out.println("Podaj iloraz");
        double q = getDoubleNumberFromUser(); // iloraz ciągu geometrycznego
        // an=a1⋅q^(n−1)
        double gNext;
        System.out.println("Wyrazy ciagu geometrycznego");
        for ( int i = 1; i <= nAmount; i++) {
            gNext = afirst * Math.pow(q, i - 1);
            System.out.println(gNext);
        }
        //Sn={a1⋅(1−q^n)/ (1−q) dla q≠1
// {a1⋅n dla q=1
        double sum = 0;
        System.out.println("Suma ciagu geometrycznego");
        for ( int k = 1; k <= nAmount; k++) {
            if ( q == 1) {
                sum = afirst * k;
            } else {
                sum = afirst * ((1 - Math.pow(q, k)) / ( 1- q));
            }
        }
            System.out.println(sum);
    }

    private static int getIntNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static double getDoubleNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextDouble();
    }

    private static void displayElements( int afirst, int rDifference, int nAmount) {

        int aNext;
        // an=a1+(n−1)⋅r
        for (int i = 1; i <= nAmount; i++) {
            aNext = afirst + (i - 1) * rDifference;
            System.out.println(aNext);
        }
    }

    private static void displaySum(int afirst, int rDifference, int nAmount) {
        //        Sn=(a1+an)/2 * n
        int suma = 0;
        int aNext;
        for ( int i = 1; i <= nAmount; i++) {
            aNext = afirst + (i - 1) * rDifference;
            suma = ((afirst + aNext)/ 2 ) * nAmount;
        }
        System.out.println(suma);
    }


}
