package Zadanie_12;

import java.util.Scanner;

public class Ex12SpacePercentage {

    public static void main(String[] args) {
        String text = getTextFromUser();
        String t1 = getTextFromUser();
        String t2 = text.replaceAll(" ", "");

        double x1 = t1.length();
        double x2 = t2.length();
        double procentSpacji = (1 - (x2/ x1 )) * 100;
        System.out.printf("%2.3f", procentSpacji);
        System.out.print(" %");
    }


    private static String getTextFromUser() {
        System.out.println("Podaj tekst");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
