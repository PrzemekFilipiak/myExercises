package Zadanie_27_extra;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

/*Użytkownik podaje dowolny tekst. Program w oddzielnych metodach ma
        wykonać następujące polecenia:
        a) Policzyć ilość samogłosek.
        b) Policzyć ilość spółgłosek.
        c) Wyświetlić tekst dużymi literami.
        d) Pierwsza i ostatnia litera ma być duża.
        e) Wyświetlić tekst na wspak.
        f) Sprawdzić czy podany tekst jest palindromem (czy czytany od tyłu
        będzie taki sam).
        g) Policzyć ilość wystąpień każdego znaku w tekście.*/

public class Ex7_CountLetters {
    public static void main(String[] args) {

        String str = getStringFromUser();
//        vowelsAmount(str);
//        consonantsAmount(str);
//        System.out.println(str.toUpperCase(Locale.ROOT));
//        firstAndSecondUpper(str);
//        reveredString(str);
        checkIfPalindrome(str);
//        int count[] = new int[256]; //128000
//        int len = str.length();

//        int[] myArray = {1, 2, 3, 3, 3, 4, 4};
//        for ( int i = 0; i < myArray.length; i++) {
//            myArray[i]++;
//        }
//        System.out.println(Arrays.toString(myArray));
//       terminal:  [2, 3, 4, 4, 4, 5, 5]
//        for (int i = 0; i < len; i++) {
//            count[str.charAt(i)]++;
//        }

//        getOccurringChar(str);
//        charFrequency(str);
    }


    private static String getStringFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    private static void vowelsAmount(String img) {
        int sum = 0;
        char[] vowels = {'i', 'u', 'o', 'a', 'e', 'y', 'I', 'U', 'O', 'A', 'E', 'Y'};
        for (int i = 0; i < img.length(); i++) {
            for (int k = 0; k < vowels.length; k++) {
                if (img.charAt(i) == vowels[k]) {
                    sum++;
                }
            }
        }
        System.out.println("Ilosc samoglosek: " + sum);
    }

    private static void consonantsAmount(String img) {
        int sum = 0;
        char[] vowels = {'i', 'u', 'o', 'a', 'e', 'y', 'I', 'U', 'O', 'A', 'E', 'Y'};
        for (int i = 0; i < img.length(); i++) {
            for (int k = 0; k < vowels.length; k++) {
                if (img.charAt(i) == vowels[k]) {
                    sum++;
                }
            }
        }
//        String repl = ;
        System.out.println("Ilosc spolgosek: " + (img.replaceAll(" ", "").length() - sum));
    }

    static void getOccurringChar(String str) {
        int[] count = new int[256];
        int len = str.length();
        char[] charArray = str.toCharArray();
        for (int i = 0; i < len; i++) {
            count[str.charAt(i)]++; // will increment the value at index, will add the value at the index
        }

        for (int i = 0; i < len; i++) {
            int find = 0;
            for (int j = 0; j <= i; j++) {
                if (str.charAt(i) == charArray[j]) {
                    find++;
                }
            }
            if (find == 1) {
                System.out.println(
                        "Number of Occurrence of "
                                + str.charAt(i)
                                + " is:" + count[str.charAt(i)]);
            }
        }
    }

    private static void charFrequency(String str) {
        //Converts given string into character array
        char[] string = str.toCharArray();
        int[] freq = new int[str.length()];

        for (int i = 0; i < str.length(); i++) {
            freq[i] = 1;
            for (int j = i + 1; j < str.length(); j++) {
                if (string[i] == string[j]) {
                    freq[i]++;
                    //Set string[j] to 0 to avoid printing visited character
                    string[j] = '0';
                }
            }
        }
        //Displays each character and their corresponding frequency
        System.out.println("Characters and their corresponding frequencies");
        for (int i = 0; i < freq.length; i++) {
//            if(string[i] != ' ' && string[i] != '0')
            if (string[i] != '0') {
                System.out.println(string[i] + "-" + freq[i]);
            }
        }
    }


    private static void firstAndSecondUpper(String user) {
        String firstLetter = user.substring(0, 1).toUpperCase(Locale.ROOT);
        String lastLetter = user.substring(user.length()-1).toUpperCase(Locale.ROOT);
        System.out.println(firstLetter + user.substring(1, user.length()-1) + lastLetter);
    }

    private static void reveredString(String user) {
        char temp;
        char[] reverserd = new char[user.length()];
        for ( int i = 0 ; i < user.length(); i++) {
            temp = user.charAt(i);
            reverserd[reverserd.length - 1 - i] = temp;
        }
        System.out.println(String.valueOf(reverserd));
    }

    private static void checkIfPalindrome(String user) {
        boolean pal = false;
        for (int i = 0; i < user.length() / 2; i++) {
            pal = user.charAt(i) == user.charAt(user.length() - 1 - i);
        }
        if (pal) {
            System.out.println("Palindrome");
        } else {
            System.out.println("To nie jest palindrome");
        }
    }

}
