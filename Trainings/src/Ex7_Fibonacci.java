import java.util.Scanner;

public class Ex7_Fibonacci {

//    Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int)
//    i obliczy liczbę Fibonacciego o wskazanym indeksie.
//    Przykładowo, jeśli użytkownik poda liczbę 5, Twój program powinien wypisać piątą liczbę Fibonacciego.
//    Kolejne liczby Fibonacciego powstają poprzez zsumowanie dwóch poprzednich liczb Fibonacciego.
//    Przykładowo, kilka pierwszych liczb Fibonacciego wynosi kolejno:
//
//            1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377…
    public static void main(String[] args) {
        int n = getNumberFromUser();

        int first = 1;
        int second = 1;
        System.out.print(first + ", ");
        System.out.print(second + ", ");
        for ( int i = 3; i <= n; i++) {
            int third = first + second;
            first = second;
            second = third;
            System.out.print(second + ", ");
        }
        System.out.println();

        for(int i = 1; i <= n; i++) {
            System.out.print(calculatedFibonacci(i) + ", ");

        }
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbę ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int calculatedFibonacci( int elementIndex) {
        if (elementIndex == 1 || elementIndex == 2 ) {
            return 1;
        }
        return calculatedFibonacci( elementIndex -1) + calculatedFibonacci(elementIndex -2);
    }


}
