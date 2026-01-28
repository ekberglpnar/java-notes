package OOP_Advanced;

// Enum: Sabit (constant) değerleri gruplamak için kullanılır.
enum Gunler {
    PAZARTESI, SALI, CARSAMBA, PERSEMBE, CUMA, CUMARTESI, PAZAR
}

public class EnumExample {
    public static void main(String[] args) {
        Gunler bugun = Gunler.CUMA;

        System.out.println("Bugün: " + bugun);

        if (bugun == Gunler.CUMA) {
            System.out.println("Yaşasın, hafta sonu geliyor!");
        }

        System.out.println("--- Tüm Günler ---");
        for (Gunler gun : Gunler.values()) {
            System.out.println(gun);
        }
    }
}
