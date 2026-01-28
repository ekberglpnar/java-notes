package Exceptions_IO;

public class MultipleCatch {
    public static void main(String[] args) {
        try {
            int[] sayilar = new int[3];
            sayilar[10] = 50; // Dizi sınırını aşma hatası (ArrayIndexOutOfBoundsException)

            int sonuc = 10 / 0;

        } catch (ArithmeticException e) {
            System.out.println("Matematiksel hata oluştu: " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Dizi indeksi aşımı: " + e.getMessage());
        } catch (Exception e) {
            // Diğer tüm hatalar için genel yakalayıcı (en sonda olmalı)
            System.out.println("Bilinmeyen bir hata oluştu: " + e.getMessage());
        }
    }
}
