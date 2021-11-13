import java.util.Scanner;

public class Ex16AscendingSequence {
//    Napisz program, który pobierze od użytkownika 10 liczb (zmiennych typu int)
//    i wypisze długość najdłuższego takiego podciągu tych liczb, który jest rosnący.
//    Przykładowo, dla liczb: „1, 3, 8, 4, 2, 5, 6, 11, 13, 7”
//    program powinien wypisać „5” jako długość najdłuższego rosnącego podciągu (w przykładzie podkreślonego).
    public static void main(String[] args) {
        System.out.println("Podaj 10 liczb: ");

        int[] arr = new int[10];
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = getTextFromUser();
        }

        int longestPath = 0;
        int tempCounter = 1;

        for ( int i = 0; i < arr.length; i++) {
            if ( arr[i - 1] < arr[i]) {
                tempCounter++;
            } else {
                tempCounter = 1;
            }

            if (longestPath < tempCounter) {
                longestPath = tempCounter;
            }

        }
        System.out.println(longestPath);

    }

    private static int getTextFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
