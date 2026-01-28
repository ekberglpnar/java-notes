package Methods;

public class MethodOverloading {
    // Method Overloading (Aşırı Yükleme):
    // Aynı isimde fakat farklı parametrelistesine sahip metotlar.

    public static int topla(int a, int b) {
        System.out.println("İki int toplanıyor...");
        return a + b;
    }

    public static int topla(int a, int b, int c) {
        System.out.println("Üç int toplanıyor...");
        return a + b + c;
    }

    public static double topla(double a, double b) {
        System.out.println("İki double toplanıyor...");
        return a + b;
    }

    public static void main(String[] args) {
        System.out.println("Sonuç 1: " + topla(5, 3));
        System.out.println("Sonuç 2: " + topla(5, 3, 2));
        System.out.println("Sonuç 3: " + topla(2.5, 3.5));
    }
}
