package Zadanie_11;

import java.util.Scanner;

public class Ex11_LongestText {
    public static void main(String[] args) {
      String longestText = "";
      while (true) {
          String text = getTextFromUser();
          if ("Starczy".equals(text)) {
              break;
          }

          if ("".equals(text)) {
              System.out.println("Nie podano żadnego tekstu");
              continue;
          }

          if (longestText.length() < text.length()) {
              longestText = text;
          }
      }

        System.out.println("Najdluzszy wprowadzony tekst to: " + longestText);
    }


    private static String getTextFromUser() {
        System.out.println("Podaj napis");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

}
