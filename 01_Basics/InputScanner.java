package Basics;

import java.util.Scanner; // Kullanıcıdan veri almak için gerekli kütüphane

public class InputScanner {
    public static void main(String[] args) {
        // Scanner nesnesi oluşturma
        Scanner scanner = new Scanner(System.in);

        System.out.print("Adınızı giriniz: ");
        String isim = scanner.nextLine(); // String okuma

        System.out.print("Yaşınızı giriniz: ");
        int yas = scanner.nextInt(); // Tamsayı okuma

        System.out.println("-----------------");
        System.out.println("Merhaba " + isim + "!");
        System.out.println("Gelecek yıl " + (yas + 1) + " yaşında olacaksın.");

        scanner.close(); // Scanner'ı kapatmak iyi bir alışkanlıktır
    }
}
