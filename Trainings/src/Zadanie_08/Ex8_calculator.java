package Zadanie_08;

import java.util.Scanner;
//Napisz program realizujący prosty kalkulator. Program powinien:
//        a. pobrać pierwszą liczbę (typu float)
//        b. pobrać jeden ze znaków: + - / *
//        c. pobrać drugą liczbę (typu float)
//        d. zwrócić wynik pobranego działania
//        Jeśli użytkownik poda znak inny niż obsługiwane, program powinien wypisać „Błędny znak”.
//        Jeśli wpisanego działania nie da się zrealizować (tj. jest niezgodne z zasadami matematyki),
//        to program powinien wypisać napis „Błąd”.

public class Ex8_calculator {
    public static void main(String[] args) {
        float f1 = getNumberFromUser();
        float f2 = getNumberFromUser();
        String sign = getSignFromUser();

        switch (sign) {
            case "+":
                System.out.println("+");
                System.out.println((f1 + f2));
                break;
            case "-":
                System.out.println("-");
                System.out.println((f1 - f2));
                break;
            case "*":
                System.out.println("*");
                System.out.println((f1 * f2)); // tutaj nie potrzeba dodatkowych nawiasow
                break;
            case "/":
                System.out.println("/");
                if ( f2 != 0) {
                    System.out.println((f1 / f2));
                } else {
                    System.out.println("Błąd");
                }
                break;
            default:
                System.out.println("Błędny znak");
        }
    }

    private static float getNumberFromUser() {
        System.out.println("Podaj liczbę pierwsza ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextFloat();
    }

    private static String getSignFromUser() {
        System.out.println("Podaj znak działania  ");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

//    private static float getNumberSecondFromUser() {  niepotrzebne
//        System.out.println("Podaj liczbę drugą ");
//        Scanner scanner = new Scanner(System.in);
//        return scanner.nextFloat();
//    }
}
