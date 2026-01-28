package ControlFlow;

import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        // Do-While döngüsü koşula bakmaksızın en az bir kez çalışır.
        Scanner scanner = new Scanner(System.in);
        int sayi;

        do {
            System.out.print("Pozitif bir sayı giriniz (Çıkmak için 0): ");
            sayi = scanner.nextInt();

            if (sayi != 0) {
                System.out.println(sayi + " sayısının karesi: " + (sayi * sayi));
            }

        } while (sayi != 0); // Sayı 0 olmadığı sürece döngü devam eder

        System.out.println("Program sonlandı.");
        scanner.close();
    }
}
