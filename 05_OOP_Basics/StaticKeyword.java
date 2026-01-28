package OOP_Basics;

class Mat {
    // Static değişken: Sınıfa aittir, nesneye değil. Tüm nesneler ortak kullanır.
    static double PI = 3.14159;

    // Static metot: Nesne oluşturulmadan çağrılabilir.
    static int kareAl(int sayi) {
        return sayi * sayi;
    }
}

class Sayac {
    static int toplamSayac = 0; // Tüm nesneler için ortak
    int kendiSayaci = 0; // Her nesne için ayrı

    public Sayac() {
        toplamSayac++;
        kendiSayaci++;
    }
}

public class StaticKeyword {
    public static void main(String[] args) {
        // Nesne oluşturmadan erişim
        System.out.println("PI sayısı: " + Mat.PI);
        System.out.println("5'in karesi: " + Mat.kareAl(5));

        System.out.println("----------------");

        Sayac s1 = new Sayac();
        System.out.println("S1 Oluşturuldu -> Toplam: " + Sayac.toplamSayac + ", Kendi: " + s1.kendiSayaci);

        Sayac s2 = new Sayac();
        System.out.println("S2 Oluşturuldu -> Toplam: " + Sayac.toplamSayac + ", Kendi: " + s2.kendiSayaci);

        Sayac s3 = new Sayac();
        System.out.println("S3 Oluşturuldu -> Toplam: " + Sayac.toplamSayac + ", Kendi: " + s3.kendiSayaci);
    }
}
