import java.util.Scanner;

public class Ex10DigitCalculeted {
    public static void main(String[] args) {
        int n = getNumberFromUser();
        int next = 0;
        while ( n != 0) {
        next += n % 10;
        n /= 10;
        }
        System.out.println(next);
    }

    private static int getNumberFromUser() {
        System.out.println("Podaj liczbę");
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

}
