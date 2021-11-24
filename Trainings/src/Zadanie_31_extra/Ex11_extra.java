package Zadanie_31_extra;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

//Użytkownik podaje rozmiar tablicy przechowującej losowe liczby
//        całkowite z przedziału <0, 50). Następnie program sortuje liczby (przez
//        wybieranie lub bąbelkowo):
//        a) od najmniejszej do największej
//        b) od największej do najmniejszej.
//        Sortowanie przez wybieranie polega na tym że szukamy najmniejszego
//        (przy sortowaniu od najmniejszego do największego) elementu i
//        wstawiamy go na pierwszej pozycji. W kolejnej iteracji szukamy
//        najmniejszego elementu zaczynając od drugiej pozycji. Iteracje
//        powtarzają się aż do momentu gdy został tylko jeden element.
public class Ex11_extra {
    public static void main(String[] args) {

        int a = 1;
        int c = 2;
        swap(a, c);
        System.out.println("Podaj rozmiar tablicy");
        int arrLenght = getNumberFromUser();
        int[] arr = new int[arrLenght];
        for ( int i = 0; i < arrLenght; i++) {
            arr[i] = new Random().nextInt(51);
        }
        System.out.println(Arrays.toString(arr));
        System.out.println("Sortowanie bąbelkowe");
        bubbleSort(arr);
        System.out.println(Arrays.toString(arr));
        System.out.println("inne sortowanie");
        int temp = 0;    //Temporary variable to store the element
        for (int i = 0; i < arr.length; i++) {  //Holds each Array element
            for (int j = i+1; j < arr.length - 1; j++) {   //compares with remaining Array elements
                if(arr[i] > arr[j]) {//Compare and swap
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));

        System.out.println("Najmniejszy element tablicy");
        int b = arr[0];
        for ( int i = 1; i < arrLenght -1; i++) {
                     if ( arr[i] < b) {
                         b = arr[i];
                 }
        }
        System.out.println(b);
        /* a[0] to a[aLength-1] is the array to sort */
        int k,j;
        int aLength = arrLenght; // initialise to a's length

        /* advance the position through the entire array */
        /*   (could do i < aLength-1 because single element is also min element) */
        for (k = 0; k < aLength-1; k++)
        {
            /* find the min element in the unsorted a[i .. aLength-1] */

            /* assume the min is the first element */
            int jMin = k;
            /* test against elements after i to find the smallest */
            for (j = k+1; j < aLength; j++)
            {
                /* if this element is less, then it is the new minimum */
                if (arr[j] < arr[jMin])
                {
                    /* found new minimum; remember its index */
                    jMin = j;
                }
            }

            if (jMin != k)
            {
                swap(arr[k], arr[jMin]);
            }
        }

//        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));

        int t = 0;
        int[] arrT = new int[arrLenght];
        for ( int i = arrLenght - 1; i >= 0; i--) {
                arrT[t++] = arr[i];

        }

        System.out.println(Arrays.toString(arrT));
    }
    private static void swap(int a, int b){
        int temp;
        temp = a;
        a = b;
        b = temp;
        System.out.println(a);
        System.out.println(b);

    }

    private static int getNumberFromUser() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    private static int[] bubbleSort(int[] a) {
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a.length - 1; j++) {
                if (a[j] > a[j + 1]) {
                    int temp = a[j + 1];
                    a[j + 1] = a[j];
                    a[j] = temp;
                }
            }
        }
        return a;
    }
}
