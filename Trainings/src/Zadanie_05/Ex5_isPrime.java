package Zadanie_05;

import java.util.Scanner;

public class Ex5_isPrime {
    public static void main (String[] args) {
        int n = getNumberFromUser();
        for (int i = 2; i <= n; i++) {
            if (isPrimeNumber(i)) {
                System.out.println(i);
            }
        }
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbe: ");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }


    private static boolean isPrimeNumber(int testNumber) {
        for (int i = 2; i * i <= testNumber; i++) {
            if ( testNumber % i == 0) {
                return false;
            }
        }
                return true; //mamy doczynienia z liczba pierwsza
    }
}




