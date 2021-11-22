package Zadanie_18;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ex18AaaPsik {

//    Napisz program, który pobierze od użytkownika tekst (zmienna typu String) i sprawdzi, czy użytkownik kichnął,
//    tzn. czy w podanym tekście znajduje się tekst „aaaa psik” z dowolnie wieloma,
//    ale minimum jedną literą ‘a’ na początku wyrażenia (czyli kichnięciem jest zarówno „a psik”, jak i „aaaaaaaaaa psik”).
//    Podpowiedź: użyj wyrażenia regularnego z odpowiednim kwantyfikatorem.
    public static void main(String[] args) {
        String tekst = getTextFromUser();
        Pattern check = Pattern.compile("[a]+ psik");
        Matcher pasuje = check.matcher(tekst);
        System.out.println(pasuje.find());
    }


    private static String getTextFromUser() {
        System.out.println("Podaj tekst");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
