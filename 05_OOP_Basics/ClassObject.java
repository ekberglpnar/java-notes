package OOP_Basics;

// Sınıf (Class) Tanımı
class Araba {
    // Özellikler (Fields)
    String marka;
    String model;
    int yil;

    // Metotlar (Methods) (Davranışlar)
    void calistir() {
        System.out.println(marka + " " + model + " çalıştırıldı!");
    }

    void durdur() {
        System.out.println(marka + " " + model + " durduruldu.");
    }
}

public class ClassObject {
    public static void main(String[] args) {
        // Nesne (Object) Oluşturma
        Araba araba1 = new Araba();

        // Özelliklere değer atama
        araba1.marka = "Toyota";
        araba1.model = "Corolla";
        araba1.yil = 2023;

        System.out.println("Araba 1: " + araba1.marka + " - " + araba1.yil);
        araba1.calistir();

        System.out.println("----------------");

        Araba araba2 = new Araba();
        araba2.marka = "Honda";
        araba2.model = "Civic";
        araba2.yil = 2022;

        System.out.println("Araba 2: " + araba2.marka + " - " + araba2.yil);
        araba2.calistir();
        araba2.durdur();
    }
}
