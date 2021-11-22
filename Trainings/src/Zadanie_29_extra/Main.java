package Zadanie_29_extra;
/*Użytkownik podaje tekst który odpowiada poniższemu szablonowi:
        [marka samochodu][model samochodu][rok produkcji][pojemność
        silnika][rodzaj nadwozia]-[imię właściciela][nazwisko właściciela][pesel]
        Program ma wczytać podany tekst i używając wyrażeń regularnych
        utworzyć obiekty klas opisanych poniżej.*/
//VW passat do zrobienia

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Podaj marke samochodu");
        String marka_samochodu = getStringFromUser();
        System.out.println("Podaj model auta");
        String model_auta = getStringFromUser();
        System.out.println("Podaj rok produkcji");
        String rokPr = getStringFromUser();
//        String rok = "2000";
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        //convert String to LocalDate
        LocalDate localDate = LocalDate.parse(rokPr.concat("/01").concat("/01"), formatter);

        System.out.println(localDate.getYear());
        System.out.println("Podaj pojemność silnika w cm3");
        String pojemnoscSilnika = getStringFromUser();
        System.out.println("Podaj rodzaj nadwozia");
        String rodzajNadwozia = getStringFromUser();
        System.out.println("Podaj imie wlasciciela");
        String imieWlasciciela = getStringFromUser();
        System.out.println("Podaj nazwisko wlasciciela");
        String nazwiskoWlasciciela = getStringFromUser();
        System.out.println("Podaj pesel");
        String pesel = getStringFromUser();
        System.out.println(pesel.charAt(2));
        String p2 = pesel;
        StringBuilder myName = new StringBuilder(p2);
        String p3 = "";
        if (pesel.substring(2,3).matches("[2]")) {
            myName.setCharAt(2, '0');
            p3 = "20".concat(String.valueOf(myName));
        }
        if (pesel.substring(2,3).matches("[3]")) {
            myName.setCharAt(2, '1');
            p3 = "20".concat(String.valueOf(myName));
        }

        System.out.println(p3);
        String p = "19".concat(pesel.substring(0,6));
        DateTimeFormatter formatter2 = DateTimeFormatter.ofPattern("yyyyMMdd");

        LocalDate dateOfBirth = LocalDate.parse(p3.substring(0,8),formatter2);
        System.out.println(dateOfBirth);

        Car nowy = new Car(marka_samochodu,
                model_auta,
                localDate,
                pojemnoscSilnika,
                rodzajNadwozia, new Person(imieWlasciciela, nazwiskoWlasciciela, pesel, dateOfBirth));
        System.out.println(nowy);
    }

    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }


}
