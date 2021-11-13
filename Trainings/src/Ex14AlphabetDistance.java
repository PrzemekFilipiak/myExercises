import java.util.Scanner;

public class Ex14AlphabetDistance {
//    Napisz program, który pobierze od użytkownika dwie małe litery alfabetu łacińskiego (typ char) i wyliczy,
//    ile znaków stoi w alfabecie pomiędzy podanymi literami.
//    Podpowiedź – skorzystaj z tablicy kodów ASCII i traktuj znaki jak liczby int.
    public static void main(String[] args) {
        char c1 = getTextFromUser().charAt(0);
        char c2 = getTextFromUser().charAt(0);
        System.out.println(c2 - c1 - 1);

    }

    private static String getTextFromUser() {
        System.out.println("Podaj tekst");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }
}
