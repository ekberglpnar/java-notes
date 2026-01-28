package ArraysStrings;

import java.util.Scanner;

public class StringPalindrome {
    public static void main(String[] args) {
        // Palindrom: Tersten okunuşu aynı olan kelime (örn: kabak, ana, level)
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir kelime giriniz: ");
        String kelime = scanner.next();

        String tersKelime = "";

        // Kelimeyi tersten oluşturma
        for (int i = kelime.length() - 1; i >= 0; i--) {
            tersKelime += kelime.charAt(i);
        }

        System.out.println("Tersi: " + tersKelime);

        if (kelime.equalsIgnoreCase(tersKelime)) {
            System.out.println("Bu kelime bir PALİNDROM'dur.");
        } else {
            System.out.println("Bu kelime palindrom değildir.");
        }

        scanner.close();
    }
}
