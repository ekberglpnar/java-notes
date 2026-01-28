package ControlFlow;

public class ForLoopBasic {
    public static void main(String[] args) {
        // 0'dan 10'a kadar sayıları yazdırma
        // Yapısı: for (başlangıç; koşul; artış)

        System.out.println("0'dan 10'a kadar sayma:");
        for (int i = 0; i <= 10; i++) {
            System.out.print(i + " ");
        }

        System.out.println("\n\n100'den 0'a 10'ar 10'ar geri sayma:");
        for (int i = 100; i >= 0; i -= 10) {
            System.out.print(i + " ");
        }
    }
}
