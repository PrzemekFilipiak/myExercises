package TwentySecond;

//Użytkownik podaje dowolną ilość znaków. Zadaniem programu jest
//        zaprezentowanie wszystkich możliwych kombinacji tych znaków.
//        Przykładowo jeżeli użytkownik poda znak ‚a’ i ‚b’ to program wyświetli:
//        aa, ab, bb, ba
//        W celu zrealizowania tego zadania użyj rekurencji (odwołanie do samego
//        siebie)
//        Następnie napisz program który wyznacza kolejne liczby ciągu
//        Fibonacciego.

import java.util.Arrays;
import java.util.Scanner;

public class Ex5_rekurencja {

    public static void main(String[] args) {
//        int first = 1;
//        int second = 1;
//        int tempIndex = 1;
//        System.out.println("Podaj ilość wyrazów ciągu Fibonacciego");
//        int n = getIntNumberFromUser();
//        System.out.print(first + ", " + second + ", ");
//        for ( int i = 1; i < n; i++) {
//            first = tempIndex;
//            tempIndex = second;
//            second = first + tempIndex;
//            System.out.print(second);
//            if ( i < n - 1) {
//                System.out.print(", ");
//            }
//        }
        System.out.println("Podaj znaki");

        String str = getCharFromUser();
        int n = str.length();
        String answer = "";
        String other;
        System.out.println("odp: ");
        permute(str, answer);
        for ( int i = 0; i < str.length(); i ++) {
            other = str.replace(str.charAt(str.length() - 1 - i), str.charAt(i));
            permute(other, answer);
        }

    }

    static void permute(String s , String answer)
    {
        if (s.length() == 0)
        {
            System.out.print(answer + "  ");
            return;
        }

        for(int i = 0 ;i < s.length(); i++)
        {
            char ch = s.charAt(i);
            String left_substr = s.substring(0, i);
            String right_substr = s.substring(i + 1);
            String rest = left_substr + right_substr;
            permute(rest, answer + ch);
        }
    }



    private static String getCharFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }



}
