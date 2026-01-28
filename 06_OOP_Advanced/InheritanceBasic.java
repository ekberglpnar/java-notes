package OOP_Advanced;

// Ebeveyn Sınıf (SuperClass)
class Arac {
    String marka = "Genel Araç";

    void kornaCal() {
        System.out.println("Düt düt!");
    }
}

// Alt Sınıf (SubClass) - Arac'tan miras alır
class Bisiklet extends Arac {
    String model = "Dağ Bisikleti";
}

public class InheritanceBasic {
    public static void main(String[] args) {
        Bisiklet bisiklet = new Bisiklet();

        // Ebeveyn sınıftan gelen özellik ve metotlar
        System.out.println("Marka: " + bisiklet.marka);
        bisiklet.kornaCal();

        // Kendi özelliği
        System.out.println("Model: " + bisiklet.model);
    }
}
