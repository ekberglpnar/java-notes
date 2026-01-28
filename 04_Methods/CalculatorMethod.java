package Methods;

import java.util.Scanner;

public class CalculatorMethod {
    // Toplama
    public static double topla(double a, double b) {
        return a + b;
    }

    // Çıkarma
    public static double cikar(double a, double b) {
        return a - b;
    }

    // Çarpma
    public static double carp(double a, double b) {
        return a * b;
    }

    // Bölme
    public static double bol(double a, double b) {
        if (b == 0) {
            System.out.println("Hata: Sayı 0'a bölünemez!");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Basit Hesap Makinesi ---");
        System.out.print("Birinci sayı: ");
        double s1 = scanner.nextDouble();

        System.out.print("İkinci sayı: ");
        double s2 = scanner.nextDouble();

        System.out.println("İşlem seçiniz (+, -, *, /): ");
        char islem = scanner.next().charAt(0);

        double sonuc = 0;

        switch (islem) {
            case '+':
                sonuc = topla(s1, s2);
                break;
            case '-':
                sonuc = cikar(s1, s2);
                break;
            case '*':
                sonuc = carp(s1, s2);
                break;
            case '/':
                sonuc = bol(s1, s2);
                break;
            default:
                System.out.println("Geçersiz işlem!");
                return;
        }

        System.out.println("Sonuç: " + sonuc);
        scanner.close();
    }
}
