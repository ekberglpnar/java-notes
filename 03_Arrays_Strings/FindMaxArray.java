package ArraysStrings;

import java.util.Scanner;

public class FindMaxArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kaç adet sayı gireceksiniz?: ");
        int n = scanner.nextInt();

        int[] dizi = new int[n];

        // Kullanıcıdan sayıları alma
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            dizi[i] = scanner.nextInt();
        }

        // En büyüğü bulma algoritması
        int enBuyuk = dizi[0]; // İlk elemanı en büyük kabul et
        int enKucuk = dizi[0];

        for (int i = 1; i < dizi.length; i++) {
            if (dizi[i] > enBuyuk) {
                enBuyuk = dizi[i];
            }
            if (dizi[i] < enKucuk) {
                enKucuk = dizi[i];
            }
        }

        System.out.println("En Büyük Sayı: " + enBuyuk);
        System.out.println("En Küçük Sayı: " + enKucuk);

        scanner.close();
    }
}
