import java.util.Scanner;
//Napisz program, który „się jąka”, to znaczy pobiera użytkownika tekst (zmienną typu String),
//        a następnie wypisuje podany tekst,
//        w którym każde słowo wypisane jest po dwa razy.
//        Przykładowo, dla wejścia: „To jest mój test” program powinien wypisać „To To jest jest mój mój test test”.
public class Ex13Stutter {
    public static void main(String[] args) {
        String text = getTextFromUser();
      String[] text2 = text.split("\\s+"); // s+ oznacza spacje ale mozna tez regex: " "
        for (String s : text2) {
            System.out.print(s + " " + s + " ");
        }
    }


    private static String getTextFromUser() {
        System.out.println("Podaj tekst");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
