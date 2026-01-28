package Methods;

public class FactorialRecursion {
    // Recursion (Özyineleme): Metodun kendi kendini çağırması
    // Faktöriyel örneği: 5! = 5 * 4 * 3 * 2 * 1

    public static int faktoriyel(int n) {
        // Temel durum (Base Case): Döngüyü kırmak için gereklidir
        if (n <= 1) {
            return 1;
        } else {
            // Kendini daha küçük bir değerle çağırma
            return n * faktoriyel(n - 1);
        }
    }

    public static void main(String[] args) {
        int sayi = 5;
        int sonuc = faktoriyel(sayi);

        System.out.println(sayi + "! = " + sonuc);
    }
}
