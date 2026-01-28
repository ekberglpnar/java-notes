package ControlFlow;

import java.util.Scanner;

public class PrimeNumberCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Asal olup olmadığını kontrol etmek için bir sayı girin: ");
        int sayi = scanner.nextInt();
        boolean asal = true;

        if (sayi <= 1) {
            asal = false;
        } else {
            // 2'den sayının yarısına kadar bölen arıyoruz
            for (int i = 2; i <= sayi / 2; i++) {
                if (sayi % i == 0) {
                    asal = false;
                    break; // Bir bölen bulduysak diğerlerine bakmaya gerek yok
                }
            }
        }

        if (asal) {
            System.out.println(sayi + " ASAL bir sayıdır.");
        } else {
            System.out.println(sayi + " asal DEĞİLDİR.");
        }

        scanner.close();
    }
}
