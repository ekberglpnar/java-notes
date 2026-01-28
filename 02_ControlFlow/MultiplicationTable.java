package ControlFlow;

public class MultiplicationTable {
    public static void main(String[] args) {
        // İç içe döngüler (Nested Loops) ile çarpım tablosu
        System.out.println("--- ÇARPIM TABLOSU ---");

        for (int i = 1; i <= 10; i++) {

            for (int j = 1; j <= 10; j++) {
                // Biçimli yazdırma (printf) ile düzenli görünüm
                // %4d: tamsayı için 4 karakterlik yer ayır
                System.out.printf("%4d", (i * j));
            }
            System.out.println(); // Her satır bitiminde alt satıra geç
        }
    }
}
