package ControlFlow;

import java.util.Scanner;

public class OddEvenCheck {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = scanner.nextInt();

        // Mod operatörü (%) kalanı verir.
        // 2'ye bölümünden kalan 0 ise sayı çifttir.
        if (sayi % 2 == 0) {
            System.out.println(sayi + " ÇİFT bir sayıdır.");
        } else {
            System.out.println(sayi + " TEK bir sayıdır.");
        }

        scanner.close();
    }
}
