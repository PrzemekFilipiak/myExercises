package Zadanie_01_Circle;

import java.util.Scanner;

public class Ex1 {

    private  static final double piM = Math.PI;
    private static final float pi = 3.14F;

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj promień: ");
        float r = scanner.nextFloat();

        float v = 2 * pi * r;
        double v2 =  2 * piM * r;
        System.out.println(v);
        System.out.println(v2);

    }
}
