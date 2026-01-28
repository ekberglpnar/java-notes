package ControlFlow;

import java.util.Scanner;

public class IfElseBasics {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Sınav notunuzu giriniz (0-100): ");
        int not = scanner.nextInt();

        if (not >= 90) {
            System.out.println("Harf Notu: AA (Mükemmel)");
        } else if (not >= 85) {
            System.out.println("Harf Notu: BA (Pekiyi)");
        } else if (not >= 70) {
            System.out.println("Harf Notu: BB (İyi)");
        } else if (not >= 50) {
            System.out.println("Harf Notu: CC (Geçer)");
        } else {
            System.out.println("Harf Notu: FF (Kaldı)");
            System.out.println("Lütfen tekrar çalışınız.");
        }

        scanner.close();
    }
}
