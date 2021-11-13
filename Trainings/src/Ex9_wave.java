import java.util.Scanner;

public class Ex9_wave {
//    Napisz program, który pobierze od użytkownika liczbę dodatnią (typu int)
//    i narysuje falę o zadanej długości i wysokości 4 linijek,
//    zgodnie z poniższym schematem (puste pola uzupełniaj spacjami):
// *            **
//   *        *    *
//     *    *        *
//       **            *


    public static void main(String[] args) {
        int n = getNumberFromUser();
        int wave_height = 4;
        int wave_length = n;

        printWave(wave_height, wave_length);

    }

    private static void printWave(int wave_height, int wave_length) {
        String[][] wave = new String[wave_height][wave_length];
        for ( int i = 0; i < wave.length; i++) {

            for ( int j = 0; j < wave[i].length; j++) {
                if ( i == j % wave_height ) {
                    wave[i][j] = "*";
                } else {
                    wave[i][j] = " ";
                }
            }
        }




        for ( int i = 0; i < wave.length; i++) {
            for ( int j = 0; j < wave[i].length; j++) {
                System.out.print(wave[i][j]);
            }
            System.out.println();
        }


    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }
}



