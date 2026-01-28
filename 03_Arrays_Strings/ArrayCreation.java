package ArraysStrings;

public class ArrayCreation {
    public static void main(String[] args) {
        // Dizi tanımlama ve değer atama yöntemleri

        // Yöntem 1: Önce boyut belirt, sonra değer ata
        int[] sayilar = new int[5]; // 5 elemanlı dizi
        sayilar[0] = 10;
        sayilar[1] = 20;
        sayilar[2] = 30;
        sayilar[3] = 40;
        sayilar[4] = 50;

        System.out.println("1. Eleman: " + sayilar[0]);

        // Yöntem 2: Doğrudan süslü parantez ile tanımlama
        String[] gunler = { "Pazartesi", "Salı", "Çarşamba", "Perşembe", "Cuma" };

        System.out.println("Haftanın 3. günü: " + gunler[2]);

        // Dizi uzunluğunu alma
        System.out.println("Günler dizisinin boyutu: " + gunler.length);

        // Döngü ile diziyi yazdırma
        System.out.println("--- GÜNLER ---");
        for (String gun : gunler) { // For-each döngüsü
            System.out.println(gun);
        }
    }
}
