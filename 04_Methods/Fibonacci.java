package Methods;

public class Fibonacci {
    // Fibonacci dizisi: 0, 1, 1, 2, 3, 5, 8, 13, 21...
    // F(n) = F(n-1) + F(n-2)

    public static int fibonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonacci(n - 1) + fibonacci(n - 2);
    }

    public static void main(String[] args) {
        int adim = 10;
        System.out.println("Fibonacci Dizisinin ilk " + adim + " elemanı:");

        for (int i = 0; i < adim; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
