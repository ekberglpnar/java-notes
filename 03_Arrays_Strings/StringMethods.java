package ArraysStrings;

public class StringMethods {
    public static void main(String[] args) {
        String metin = "Java Programlama Dili";

        System.out.println("Orijinal Metin: " + metin);

        // Uzunluk
        System.out.println("Uzunluk: " + metin.length());

        // Büyük/Küçük harf
        System.out.println("Büyük Harf: " + metin.toUpperCase());
        System.out.println("Küçük Harf: " + metin.toLowerCase());

        // İçerik kontrolü
        System.out.println("Java ile mi başlıyor?: " + metin.startsWith("Java"));
        System.out.println("Dili ile mi bitiyor?: " + metin.endsWith("Dili"));
        System.out.println("İçinde 'gram' var mı?: " + metin.contains("gram"));

        // Parça alma (Substring)
        System.out.println("İlk 4 karakter: " + metin.substring(0, 4));
        System.out.println("5. karakterden sonrası: " + metin.substring(5));

        // Değiştirme (Replace)
        System.out.println("Boşlukları tire yap: " + metin.replace(" ", "-"));

        // Boşluk temizleme (Trim)
        String bosluklu = "   Merhaba   ";
        System.out.println("Trim öncesi: [" + bosluklu + "]");
        System.out.println("Trim sonrası: [" + bosluklu.trim() + "]");
    }
}
