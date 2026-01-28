package OOP_Advanced;

// Abstract (Soyut) Sınıf: Nesnesi oluşturulamaz (new Oyun() denemez).
// Sadece kalıtım vermek ve bir şablon oluşturmak için kullanılır.
abstract class Oyun {
    // Abstract Metot: Gövdesi yoktur, alt sınıflar bunu MECBUR override etmelidir.
    abstract void basla();

    // Normal metot da barındırabilir.
    void bitti() {
        System.out.println("Oyun bitti.");
    }
}

class Mario extends Oyun {
    @Override
    void basla() {
        System.out.println("Mario oyunu başlıyor... Zıpla!");
    }
}

class Satranc extends Oyun {
    @Override
    void basla() {
        System.out.println("Satranç başlıyor... Beyaz oynar.");
    }
}

public class AbstractClass {
    public static void main(String[] args) {
        // Oyun oyun = new Oyun(); // HATA! Soyut sınıftan nesne üretilemez.

        Oyun oyun1 = new Mario();
        oyun1.basla();
        oyun1.bitti();

        Oyun oyun2 = new Satranc();
        oyun2.basla();
    }
}
