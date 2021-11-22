package Zadanie_04;

import java.util.Scanner;

public class Ex4PifPafZaLiczbe {

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static void main(String[] args) {
        int number = getNumberFromUser();
// mozna na dwoch if'ach
        for (int i = 1; i <= number; i++) {

            if (i % 3 == 0 && i % 7 == 0) {
                System.out.println("Pif Paf");
            } else if (i % 7 == 0) {
                System.out.println("Paf");
            } else if (i % 3 == 0) {
                System.out.println("Pif");
            } else {
                System.out.println(i);
            }
        }
    }
}
