package OOP_Advanced;

class Calisan {
    void maasAl() {
        System.out.println("Çalışan maaş aldı.");
    }
}

class Mudur extends Calisan {
    // Overriding: Ebeveyn sınıftaki metodu kendi ihtiyacına göre yeniden tanımlama.
    // Metot ismi, parametreleri aynı olmalı.

    @Override // Bu bir notasyondur, okunabilirliği artırır ve hata varsa uyarır.
    void maasAl() {
        System.out.println("Müdür MAAŞ + PRİM aldı.");
    }
}

class Stajyer extends Calisan {
    @Override
    void maasAl() {
        System.out.println("Stajyer harçlık aldı.");
    }
}

public class MethodOverriding {
    public static void main(String[] args) {
        Calisan c1 = new Calisan();
        Calisan c2 = new Mudur(); // Polymorphism (Çok biçimlilik) tabanlı referans
        Calisan c3 = new Stajyer();

        c1.maasAl();
        c2.maasAl(); // Müdür'ün metodu çalışır
        c3.maasAl(); // Stajyer'in metodu çalışır
    }
}
