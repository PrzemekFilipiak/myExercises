package TwentySecond;

import javax.swing.event.CaretEvent;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;


//        f) Utwórz nową tablicę zawierającą tylko elementy mniejsze od liczby
//        podanej przez użytkownika i wyświetl ją.
//        g) Utwórz tablicę dwu wymiarową. Pierwszy wiersz ma zawierać liczby
//        parzyste a drugi nieparzyste pochodzące z pierwotnej tablicy.
//        Wyświetl wszystkie elementy.
//        h) Wyświetl elementy w odwrotnej kolejności.
public class Ex1_cd2Arr {
    public static void main(String[] args) {

        System.out.println("Podaj liczbę elementów");
        int n = getTextFromUser();

        int[] arr = new int[n];

        System.out.println("Podaj maksymalny przedział <0, max)");
        int max = getTextFromUser();

//        System.out.println("Podaj liczbę najwiekasza");
//        int u = getTextFromUser();

//        displaySecondArray(u,max, arr); //Utwórz nową tablicę zawierającą tylko elementy mniejsze od liczby
//        podanej przez użytkownika i wyświetl ją.
//        displaysOddAndEven(arr, max);
        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(max);
        }
        System.out.println(Arrays.toString(arr));

        for ( int i = 0; i < arr.length/2; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - 1 -i];
            arr[arr.length - 1 - i] = temp;
            }


        System.out.println(Arrays.toString(arr));

    }

    private static int getTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void displayElementsArray(int[] arr) {
        for ( int element: arr) {
            System.out.println(element);
        }
    }

    private static void displaySecondArray(int u, int max, int[] arr) {
        int[] arrUser = new int[arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(max);
        }

        for (int e : arr) {
            System.out.println(e);
        }

        System.out.println("Druga tablica");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < u) {
                arrUser[i] = arr[i];
            }
        }

        System.out.println(Arrays.toString(arrUser));
    }


    private static void displaysOddAndEven(int[] arr, int max) {
        int[][] arrUser = new int[2][arr.length];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = new Random().nextInt(max);
        }

        System.out.println(Arrays.toString(arr));

        System.out.print("nieparzyste[], parzyste[] = ");
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arrUser[0][i] = arr[i];
            } else {
                arrUser[1][i] = arr[i];
            }
        }
        System.out.println(Arrays.deepToString(arrUser));
        int k = arrUser.length;

        for (int i = 0; i < arrUser.length; i++) {
            System.out.print("[ ");
            for (int j = 0; j < arrUser[i].length; j++) {
                if (arrUser[i][j] != 0 ) {
                    System.out.print(arrUser[i][j]);
                }
                if (arrUser[i][j] != arrUser[0][arrUser[k-1].length - 1] &&
                        arrUser[i][j] != arrUser[1][arrUser[k-1].length - 1]  &&
                        arrUser[i][j] != 0) {
                    System.out.print(", ");
                }
            }
            System.out.println("]");
        }

        }
    }
