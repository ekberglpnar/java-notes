package OOP_Advanced;

class DisSinif { // Outer Class
    private String mesaj = "Dış sınıftan merhaba!";

    // İç Sınıf (Inner Class)
    class IcSinif {
        void goster() {
            // İç sınıf, dış sınıfın private değişkenlerine erişebilir
            System.out.println("Erişilen mesaj: " + mesaj);
        }
    }
}

public class InnerClasses {
    public static void main(String[] args) {
        DisSinif dis = new DisSinif();

        // İç sınıfın nesnesini oluşturma
        DisSinif.IcSinif ic = dis.new IcSinif();
        ic.goster();
    }
}
