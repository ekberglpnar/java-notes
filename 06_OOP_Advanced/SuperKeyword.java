package OOP_Advanced;

class Hayvan { // Parent
    String tur = "Hayvan";

    public Hayvan() {
        System.out.println("Hayvan oluşturuldu.");
    }

    void sesCikar() {
        System.out.println("Hayvan ses çıkarıyor...");
    }
}

class Kopek extends Hayvan { // Child
    String tur = "Köpek"; // Parent'taki değişkeni eziyor (Shadowing)

    public Kopek() {
        super(); // Parent constructor'ı çağırır (ilk satırda olmalı)
        System.out.println("Köpek oluşturuldu.");
    }

    void turleriGoster() {
        System.out.println("Benim türüm: " + tur);
        System.out.println("Atamın türü: " + super.tur); // super ile parent class'a erişim
    }

    void sesCikar() {
        super.sesCikar(); // Parent'taki metodu çağırma
        System.out.println("Hav Hav!");
    }
}

public class SuperKeyword {
    public static void main(String[] args) {
        Kopek kopek = new Kopek();

        System.out.println("---");
        kopek.turleriGoster();
        System.out.println("---");
        kopek.sesCikar();
    }
}
