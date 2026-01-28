package Basics;

public class ArithmeticOperators {
    public static void main(String[] args) {
        int a = 10;
        int b = 3;

        System.out.println("Sayı A: " + a);
        System.out.println("Sayı B: " + b);

        // Temel İşlemler
        System.out.println("Toplama (a + b): " + (a + b));
        System.out.println("Çıkarma (a - b): " + (a - b));
        System.out.println("Çarpma (a * b): " + (a * b));
        System.out.println("Bölme (a / b): " + (a / b)); // Tamsayı bölmesi (sonuç 3)
        System.out.println("Mod alma (Kalan) (a % b): " + (a % b)); // 10'un 3'e bölümünden kalan 1

        // Arttırma ve Azaltma
        a++; // a'yı 1 arttırır (11 olur)
        System.out.println("a++ sonrası: " + a);

        b--; // b'yi 1 azaltır (2 olur)
        System.out.println("b-- sonrası: " + b);
    }
}
