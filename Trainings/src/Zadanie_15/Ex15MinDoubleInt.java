package Zadanie_15;

import java.util.Scanner;

public class Ex15MinDoubleInt {

//    Napisz program, który pobierze od użytkownika 10 dowolnie dużych liczb (zmiennych typu int)
//    i wypisze te, które wystąpiły minimum dwukrotnie.
    public static void main(String[] args) {
        System.out.println("Podaj 10 liczb: ");

        int[] arr = new int[2];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = getTextFromUser();
        }

        for (int j = 0; j < arr.length; j++) {
            for (int k = j + 1; k < arr.length; k++) {
                if (arr[j] == arr[k]) {
                    System.out.print(arr[j] + " ");
                    break;
                }
            }
        }
    }

    private static int getTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
