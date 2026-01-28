package ControlFlow;

import java.util.Scanner;

public class LargestOfThree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Üç sayı alalım
        System.out.println("Lütfen üç farklı sayı giriniz:");
        int s1 = scanner.nextInt();
        int s2 = scanner.nextInt();
        int s3 = scanner.nextInt();

        int enBuyuk;

        // Karşılaştırma mantığı
        if (s1 >= s2 && s1 >= s3) {
            enBuyuk = s1;
        } else if (s2 >= s1 && s2 >= s3) {
            enBuyuk = s2;
        } else {
            enBuyuk = s3;
        }

        System.out.println("Girilen en büyük sayı: " + enBuyuk);

        scanner.close();
    }
}
