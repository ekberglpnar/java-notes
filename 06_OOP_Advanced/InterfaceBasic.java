package OOP_Advanced;

// Interface (Arayüz): 
// İçindeki tüm metotlar varsayılan olarak "public abstract"tir.
// Bir sınıf, birden fazla interface'i implemente edebilir.
interface UzaktanKumanda {
    void ac();

    void kapat();
}

class Televizyon implements UzaktanKumanda {
    @Override
    public void ac() {
        System.out.println("Televizyon açıldı.");
    }

    @Override
    public void kapat() {
        System.out.println("Televizyon kapandı.");
    }
}

public class InterfaceBasic {
    public static void main(String[] args) {
        UzaktanKumanda kumanda = new Televizyon();
        kumanda.ac();
        kumanda.kapat();
    }
}
