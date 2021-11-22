package Zadanie_09;

import java.util.Scanner;

public class Ex9_wave {
//    Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int)
//    i narysuje falę o zadanej długości i wysokości 4 linijek,
//    zgodnie z poniższym schematem (puste pola uzupełniaj spacjami):
// *            **
//   *        *    *
//     *    *        *
//       **            *


    public static void main(String[] args) {
        int wave_height = 4;
        int wave_length = getNumberFromUser();

        printWave(wave_height, wave_length);

    }

    private static void printWave(int wave_height, int wave_length) {
        String character = "*";
        int height = 4;
        int length = getNumberFromUser();

        for (int i = 1; i <= height; i++) { //i --> indeks pionowy
            for (int j = 1; j <= length; j++) { //j --> indeks poziomy
                int tempIndex = j % height;
                tempIndex = tempIndex == 0 ? height : tempIndex; // 1 ,2, 3, 4
                if (((j - 1) / height) % 2 == 1 ) {
                    //wznoszące
                    if (i == height - tempIndex + 1) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                } else {
                    //opadajace
                    if (i == tempIndex) {
                        System.out.print(character);
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }


    private static int getNumberFromUser() {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}



