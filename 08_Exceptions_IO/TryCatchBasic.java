package Exceptions_IO;

public class TryCatchBasic {
    public static void main(String[] args) {
        // Exception (İstisna): Program çalışırken oluşan hatalar.

        System.out.println("Program başladı.");

        try {
            // Hata oluşturabilecek kod bloğu
            int sonuc = 10 / 0; // Sıfıra bölünme hatası (ArithmeticException)
            System.out.println("Sonuç: " + sonuc); // Burası çalışmaz
        } catch (ArithmeticException e) {
            // Hata yakalandığında yapılacak işlem
            System.out.println("HATA: Bir sayı sıfıra bölünemez!");
        } finally {
            // Her durumda çalışacak kod (isteğe bağlı)
            System.out.println("Bu blok her zaman çalışır.");
        }

        System.out.println("Program normal şekilde sonlandı.");
    }
}
