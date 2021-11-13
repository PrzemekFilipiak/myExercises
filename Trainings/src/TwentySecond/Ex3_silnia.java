package TwentySecond;
//Stwórz program liczący silnię liczby podanej przez użytkownika.

import java.math.BigDecimal;
import java.math.BigInteger;
import java.math.RoundingMode;
import java.util.Scanner;

public class Ex3_silnia {
    public static void main(String[] args) {
        System.out.println("Podaj liczbę do policzenia silni");
        int number = getNumberFromUser();
        int multi = 1;
        double v = Math.sqrt(2 * Math.PI * number) * Math.pow(number / Math.E, number);
        BigDecimal hhh = new BigDecimal(v);
        System.out.println(hhh.setScale(0, RoundingMode.CEILING));

        double silnia = Math.ceil(v);
        System.out.println(silnia);

        System.out.println("for");
        for ( int i = 1; i <= number; i++) {
            multi *= i;
        }

        System.out.println(multi);
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
