package Collections;

import java.util.ArrayList;
import java.util.Collections; // Sıralama için

public class ArrayListDemo {
    public static void main(String[] args) {
        // ArrayList: Boyutu dinamik olarak değişebilen dizi
        ArrayList<String> sehirler = new ArrayList<>();

        // Ekleme
        sehirler.add("İstanbul");
        sehirler.add("Ankara");
        sehirler.add("İzmir");
        sehirler.add("Bursa");

        System.out.println("Şehirler: " + sehirler);

        // Araya Ekleme
        sehirler.add(0, "Antalya"); // En başa ekler

        // Erişme
        System.out.println("2. Şehir: " + sehirler.get(2));

        // Silme
        sehirler.remove("Bursa"); // İsme göre
        sehirler.remove(1); // İndekse göre

        System.out.println("Silme sonrası: " + sehirler);

        // Sıralama (Alfabetik)
        Collections.sort(sehirler);
        System.out.println("Sıralı: " + sehirler);

        // Boyut
        System.out.println("Toplam şehir: " + sehirler.size());
    }
}
