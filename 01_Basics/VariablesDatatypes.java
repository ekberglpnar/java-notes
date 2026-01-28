package Basics;

public class VariablesDatatypes {
    public static void main(String[] args) {
        // İlkel (Primitive) Veri Tipleri
        
        // Tamsayılar
        byte kucukSayi = 127;          // -128 ile 127 arası
        short kisaSayi = 32000;       // -32768 ile 32767 arası
        int tamSayi = 100000;         // Genellikle kullanılan tamsayı tipi
        long uzunSayi = 999999999L;   // Çok büyük tamsayılar (sonuna L konur)
        
        // Ondalıklı Sayılar
        float ondalikliKisa = 3.14f;  // Sonuna f konur
        double ondalikliUzun = 3.14159; // Daha hassas ondalık
        
        // Karakter ve Mantıksal
        char karakter = 'A';          // Tek tırnak içinde tek karakter
        boolean dogruMu = true;       // true veya false
        
        System.out.println("Tamsayı (int): " + tamSayi);
        System.out.println("Ondalıklı (double): " + ondalikliUzun);
        System.out.println("Karakter (char): " + karakter);
        System.out.println("Mantıksal (boolean): " + dogruMu);
    }
}
