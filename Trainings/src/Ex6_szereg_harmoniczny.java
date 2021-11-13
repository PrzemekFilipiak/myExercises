import java.util.Scanner;

public class Ex6_szereg_harmoniczny {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();

        double sum = 0;

        for ( int i = 1; i <= number; ++i) {
            sum += 1 / (double)(i);
        }

        System.out.println("Suma szeregu harmonicznego = " + sum);
    }
}
