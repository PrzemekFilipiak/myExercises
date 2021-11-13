public class HelloWorld {


    private static void rekurencja ( int x) {
        if (x == 0) {
            System.out.println("cos");
        } else {
            rekurencja(x - 1);
        }
    }

    public static void main(String[] args) {
        System.out.println("Hello World!");
        rekurencja(10);
    }
}

