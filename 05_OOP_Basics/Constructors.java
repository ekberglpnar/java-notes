package OOP_Basics;

class Ogrenci {
    String ad;
    int yas;

    // Default (Boş) Constructor
    // Hiçbir constructor yazmazsak Java bunu otomatik oluşturur.
    public Ogrenci() {
        System.out.println("Yeni bir öğrenci oluşturuluyor...");
        ad = "İsimsiz";
        yas = 0;
    }

    // Parametreli Constructor
    // Nesne oluşturulurken değer atamamızı sağlar.
    public Ogrenci(String ad, int yas) {
        this.ad = ad;
        this.yas = yas;
    }

    void bilgileriGoster() {
        System.out.println("Öğrenci Adı: " + ad + ", Yaş: " + yas);
    }
}

public class Constructors {
    public static void main(String[] args) {
        // Parametresiz constructor
        Ogrenci ogr1 = new Ogrenci();
        ogr1.bilgileriGoster();

        System.out.println("----------------");

        // Parametreli constructor
        Ogrenci ogr2 = new Ogrenci("Ahmet", 20);
        ogr2.bilgileriGoster();
    }
}
