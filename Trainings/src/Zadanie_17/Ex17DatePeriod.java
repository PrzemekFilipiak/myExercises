package Zadanie_17;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Ex17DatePeriod {
//    Napisz program, który pobierze od użytkownika datę najbliższych Twoich zajęć w SDA i obliczy ile dni do nich pozostało.
//    Podpowiedź: datę wczytaj jako typ String i przeparsuj na LocalDate.
//    Obecną datę pobierz z metody LocalDate.now().
    public static void main(String[] args) {
        String date = getTextFromUser();
        LocalDate local = LocalDate.parse(date);
        LocalDate now1 = LocalDate.now();

//        Period resultDays = Period.between( now1, local ); nie sprawdza się co do różnych miesięcy
//        System.out.println(resultDays.toString());
        DateTimeFormatter.ofPattern("yyyy-MM-dd");
        System.out.println(ChronoUnit.DAYS.between( now1, local ));
    }


    private static String getTextFromUser() {
        System.out.println("Podaj date zajec");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
