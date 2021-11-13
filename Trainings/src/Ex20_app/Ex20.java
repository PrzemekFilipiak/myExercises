package Ex20_app;

import java.util.Random;
import java.util.Scanner;

//Napisz program, który będzie z Tobą grał w „za dużo, za mało”.
//        Na początku komputer losuje liczbę z zakresu od 0 do 100
//        (podpowiedź: skorzystaj z metody Random.nextInt()) a następnie czeka na podanie liczby przez użytkownika.
//        Jeśli użytkownik poda liczbę większą, niż wylosowana przez komputer,
//        program powinien wypisać „za dużo” i czekać na podanie kolejnej liczby.
//        Jeśli użytkownik poda liczbę mniejszą, program powinien wypisać „za mało” i analogicznie czekać na następną liczbę.
//        Jeśli użytkownik poda odpowiednią wartość, to program powinien wypisać słowo „Bingo!” i zakończyć się.
public class Ex20 {
    public static void main(String[] args) {
        System.out.println("Gra za dużo, za mało");
        int number = new Random().nextInt(100);
        System.out.println(number);
        System.out.println("Podaj liczbę");
        int nUser;

        do {
            nUser = getNumberFromUser();
            if (nUser < number) {
                System.out.println("za mało");
            } else if (nUser > number) {
                System.out.println("za dużo");
            } else {
                System.out.println("Bingo");
            }
        } while (nUser != number);
    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}

