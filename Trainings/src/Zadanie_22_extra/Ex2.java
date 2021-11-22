package Zadanie_22_extra;
//Użytkownik podaje liczbę całkowitą z przedziału <0, 200). Program ma
//        podaną liczbę wyświetlić jako reprezentację tekstową:
//        - 1 „jeden”
//        - 2 „dwa”
//        - 10 „dziesięć”
//        - 123 „sto dwadzieścia trzy”

import java.lang.reflect.Array;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {

         String[] jednosci = {"", " jeden", " dwa", " trzy", " cztery", " piec", " szesc", " siedem", " osiem", " dziewiec"};
         String[] nascie = {"dziesiec", " jedenascie", " dwanascie", " trzynascie", " czternascie", " pietnascie", " szesnascie", " siedemnascie", " osiemnascie", " dziewietnascie"};
         String[] dziesiatki ={"", " dziesiec", " dwadziescia", " trzydziesci", " czterdziesci", " piecdziesiat", " szescdziesiat", " siedemdziesiat", " osiemdziesiat", " dziewiecdziesiat"};
         String[] setki = {"", " sto", " dwiescie"};

        String slownie = " ";
        int liczba;
        int koncowka;
        int j = 0;

        System.out.println("Podaj liczbe do zamiany na slowa");
        liczba = getNumberFromUser();

        if (liczba==0) slownie="zero";

        while (liczba>0)
        {
            koncowka=(liczba%10);
            liczba/=10;
//            if ((j==0)&&(liczba%100!=0 || koncowka !=0));
            if ((j==0)&&(liczba%10!=1)) {
                slownie = jednosci[koncowka].concat(slownie);
            }
            if ((j==0)&&(liczba%10==1)) {
                slownie = nascie[koncowka].concat(slownie);
                liczba/=10;
                j+=2;
                continue;
            }
            if (j==1) {
                slownie = dziesiatki[koncowka].concat(slownie);
            }
            if (j==2)
            {
                slownie = setki[koncowka].concat(slownie);
                j=-1;
            }
            j++;
        }
        System.out.println("Odpowiedz: " + slownie);

    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}
