package Exceptions_IO;

// Kendi Exception sınıfımızı oluşturma
class YetersizBakiyeException extends Exception {
    public YetersizBakiyeException(String mesaj) {
        super(mesaj);
    }
}

class Atm {
    void paraCek(double bakiye, double miktar) throws YetersizBakiyeException {
        if (miktar > bakiye) {
            throw new YetersizBakiyeException("Bakiye yetersiz! Mevcut: " + bakiye);
        }
        System.out.println("Para çekildi: " + miktar);
    }
}

public class CustomException {
    public static void main(String[] args) {
        Atm atm = new Atm();
        try {
            atm.paraCek(100, 200);
        } catch (YetersizBakiyeException e) {
            System.out.println("ÖZEL HATA: " + e.getMessage());
        }
    }
}
