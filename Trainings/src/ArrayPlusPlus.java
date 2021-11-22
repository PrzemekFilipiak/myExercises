import java.util.Arrays;

public class ArrayPlusPlus {
    public static void main(String[] args) {
        int t = 0;
        int[] arr = {1, 2, 3};
        System.out.println("t= " + t);
        System.out.println(arr[++t]); // kolejne elementy po inkrementacji
        System.out.println("t= " + t);
        System.out.println(++arr[t]); // inkrementacja
        System.out.println("t= " + t);
    }
}
