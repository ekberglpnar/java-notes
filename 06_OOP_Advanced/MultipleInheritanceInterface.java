package OOP_Advanced;

interface Kamera {
    void fotoCek();
}

interface MuzikCalar {
    void muzikCal();
}

// Java'da class'lar tek miras alır ama birden fazla interface'i implemente
// edebilir.
// Bu sayede "Çoklu Kalıtım" ihtiyacı karşılanır.
class AkilliTelefon implements Kamera, MuzikCalar {
    @Override
    public void fotoCek() {
        System.out.println("Çıt! Fotoğraf çekildi.");
    }

    @Override
    public void muzikCal() {
        System.out.println("Müzik çalıyor: Lalala...");
    }
}

public class MultipleInheritanceInterface {
    public static void main(String[] args) {
        AkilliTelefon telefon = new AkilliTelefon();
        telefon.fotoCek();
        telefon.muzikCal();
    }
}
