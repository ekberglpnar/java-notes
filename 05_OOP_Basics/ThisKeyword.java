package OOP_Basics;

class Kutu {
    int genislik;
    int yukseklik;
    int derinlik;

    // "this" kelimesi sınıfın kendi özelliklerini işaret eder.
    // Parametre ismi ile sınıf değişkeni ismi aynı olduğunda karışıklığı önler.
    public Kutu(int genislik, int yukseklik, int derinlik) {
        this.genislik = genislik;
        this.yukseklik = yukseklik;
        this.derinlik = derinlik;
    }

    int hacimHesapla() {
        return genislik * yukseklik * derinlik;
        // Burada this kullanmaya gerek yok çünkü isim çakışması yok, ama isterseniz
        // "this.genislik" de diyebilirsiniz.
    }
}

public class ThisKeyword {
    public static void main(String[] args) {
        Kutu kutu = new Kutu(10, 20, 5);
        System.out.println("Kutunun Hacmi: " + kutu.hacimHesapla());
    }
}
