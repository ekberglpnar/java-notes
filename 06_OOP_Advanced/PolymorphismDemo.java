package OOP_Advanced;

class Sekil {
    void ciz() {
        System.out.println("Şekil çiziliyor...");
    }
}

class Daire extends Sekil {
    @Override
    void ciz() {
        System.out.println("Daire çiziliyor O");
    }
}

class Kare extends Sekil {
    @Override
    void ciz() {
        System.out.println("Kare çiziliyor []");
    }
}

class Ucgen extends Sekil {
    @Override
    void ciz() {
        System.out.println("Üçgen çiziliyor /\\");
    }
}

public class PolymorphismDemo {
    public static void main(String[] args) {
        // Polymorphism: Bir nesnenin farklı nesneler gibi davranabilmesi
        // Sekil referansı ile farklı alt sınıfları tutabiliyoruz.

        Sekil[] sekiller = new Sekil[3];
        sekiller[0] = new Daire();
        sekiller[1] = new Kare();
        sekiller[2] = new Ucgen();

        System.out.println("--- Polimorfizm Döngüsü ---");
        for (Sekil s : sekiller) {
            s.ciz(); // Her nesne kendi ciz() metodunu çalıştırır
        }
    }
}
