package TwentySecond;
/*Stwórz trzy tablice wypełnione losowymi liczbami całkowitymi z
        przedziału <0, 20). Rozmiar każdej tablicy podaje użytkownik. Następnie
        w osobnych metodach wykonaj:
        a) Utwórz tablicę będącą złączeniem trzech tablic i wyświetl jej
        elementy.
        b) Utwórz tablicę będącą złączeniem trzech tablic ale żaden element
        nie może się powtórzyć i wyświetl jej zawartość*/

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ex8_ArraysAdds {
    public static void main(String[] args) {
        System.out.println("Create 3 arrays and enter length");
        int a = getIntFromUser();
        int b = getIntFromUser();
        int c = getIntFromUser();
        int[] xArray = new int[a];
        int[] yArray = new int[b];
        int[] zArray = new int[c];

        for ( int i = 0; i < xArray.length; i++) {
            xArray[i] = new Random().nextInt(20);
        }
        System.out.println(Arrays.toString(xArray));
        for ( int i = 0; i < yArray.length; i++) {
            yArray[i] = new Random().nextInt(20);
        }
        System.out.println(Arrays.toString(yArray));

        for ( int i = 0; i < zArray.length; i++) {
            zArray[i] = new Random().nextInt(20);
        }
        System.out.println(Arrays.toString(zArray));

        addsWithoutRepeating(xArray, yArray, zArray);
    }


    private static int getIntFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static void addsArrays(int[] xArray, int[] yArray, int[] zArray ) {
        int a = xArray.length;
        int b = yArray.length;
        int c = zArray.length;
        int[] sumArr = new int[a + b + c];
        for ( int i = 0; i < sumArr.length; i++) {
            if ( i < a) {
                sumArr[i] = xArray[i];
            }
            if ( i < b) {
                sumArr[a + i] = yArray[i];
            }
            if (i < c) {
                sumArr[a + b + i] = zArray[i];
            }
        }

        System.out.println(Arrays.toString(sumArr));
    }

    private static void addsWithoutRepeating(int[] xArray, int[] yArray, int[] zArray ) {
        int a = xArray.length;
        int b = yArray.length;
        int c = zArray.length;
        int[] sumArr = new int[a + b + c];
        for ( int i = 0; i < sumArr.length; i++) {
            if ( i < a) {
                sumArr[i] = xArray[i];
            }
            if ( i < b) {
                sumArr[a + i] = yArray[i];
            }
            if (i < c) {
                sumArr[a + b + i] = zArray[i];
            }
        }
        System.out.println(Arrays.toString(sumArr));

        int[] nor;
        nor = Arrays.copyOf(sumArr, sumArr.length);
        int sum = 0;
        for ( int z = 0; z < sumArr.length; z++) {
            for ( int w = z + 1; w < sumArr.length; w++) {
                if (sumArr[z] == sumArr[w]) {
                    nor[z] = -1;
                    sum++;
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(nor));
        System.out.println("suma " + sum);

        int[] temp = new int[nor.length - sum];
        int la = nor.length;
        int g;
        int t = 0;
        for ( int i = 0; i < la; i++) {
            if (nor[i] != -1) {
                g = nor[i];
                temp[t++] = g;
            }
        }
        System.out.println(Arrays.toString(temp));
    }
    
}
