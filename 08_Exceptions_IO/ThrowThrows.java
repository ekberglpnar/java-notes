package Exceptions_IO;

public class ThrowThrows {
    // throws: Bu metodun hata fırlatabileceğini belirtir.
    // Çağıran yer (main) bu hatayı handle etmek zorundadır.
    public static void yasKontrol(int yas) throws IllegalArgumentException {
        if (yas < 18) {
            // throw: Manuel olarak hata fırlatma
            throw new IllegalArgumentException("Yaşınız 18'den küçük, giremezsiniz!");
        } else {
            System.out.println("Giriş başarılı.");
        }
    }

    public static void main(String[] args) {
        try {
            yasKontrol(15);
        } catch (IllegalArgumentException e) {
            System.out.println("Hata Yakalandı: " + e.getMessage());
        }
    }
}
