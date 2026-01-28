package Methods;

public class MethodBasic {
    // Metot tanımlama: public access_modifier, static (nesnesiz çağırma), void
    // return_type
    public static void selamla() {
        System.out.println("Merhaba! Bu bir metot çağrısıdır.");
    }

    // Parametre alan metot
    public static void ozelSelamla(String isim) {
        System.out.println("Merhaba " + isim + ", hoş geldin!");
    }

    // Değer döndüren metot
    public static int topla(int a, int b) {
        return a + b;
    }

    public static void main(String[] args) {
        // Metotları çağırma
        selamla();

        ozelSelamla("Ahmet");
        ozelSelamla("Ayşe");

        int sonuc = topla(5, 10);
        System.out.println("Toplama Sonucu: " + sonuc);
    }
}
