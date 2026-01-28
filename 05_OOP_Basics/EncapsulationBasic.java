package OOP_Basics;

class BankaHesabi {
    // Private: Sadece bu sınıf içinden erişilebilir (Kapsülleme)
    private double bakiye;
    private String hesapSahibi;

    public BankaHesabi(String hesapSahibi, double baslangicBakiye) {
        this.hesapSahibi = hesapSahibi;
        if (baslangicBakiye > 0) {
            this.bakiye = baslangicBakiye;
        }
    }

    // Getter (Okuma) Metodu
    public double getBakiye() {
        return bakiye;
    }

    public String getHesapSahibi() {
        return hesapSahibi;
    }

    // Setter (Yazma) Metodu
    public void paraYatir(double miktar) {
        if (miktar > 0) {
            bakiye += miktar;
            System.out.println(miktar + " TL yatırıldı. Yeni bakiye: " + bakiye);
        } else {
            System.out.println("Geçersiz miktar!");
        }
    }

    public void paraCek(double miktar) {
        if (miktar > 0 && miktar <= bakiye) {
            bakiye -= miktar;
            System.out.println(miktar + " TL çekildi. Kalan bakiye: " + bakiye);
        } else {
            System.out.println("Yetersiz bakiye veya geçersiz miktar!");
        }
    }
}

public class EncapsulationBasic {
    public static void main(String[] args) {
        BankaHesabi hesap = new BankaHesabi("Ali Can", 1000);

        // HATA: hesap.bakiye = 5000; // private olduğu için doğrudan erişilemez!

        System.out.println("Hesap Sahibi: " + hesap.getHesapSahibi());
        System.out.println("Mevcut Bakiye: " + hesap.getBakiye());

        hesap.paraYatir(500);
        hesap.paraCek(2000); // Yetersiz bakiye uyarısı verir
        hesap.paraCek(700);
    }
}
