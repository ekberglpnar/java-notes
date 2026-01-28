package Collections;

import java.util.ArrayList;
import java.util.Iterator;

public class IteratorExample {
    public static void main(String[] args) {
        // Iterator: Koleksiyonlar üzerinde güvenli bir şekilde dolaşmayı sağlar.
        // Özellikle döngü sırasında eleman silmek gerekirse Iterator kullanılmalıdır.

        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Ali");
        isimler.add("Veli");
        isimler.add("Ayşe");
        isimler.add("Fatma");

        System.out.println("Eski Liste: " + isimler);

        // Iterator oluşturma
        Iterator<String> it = isimler.iterator();

        while (it.hasNext()) { // Bir sonraki eleman var mı?
            String isim = it.next(); // Sıradaki elemanı getir

            if (isim.equals("Veli")) {
                it.remove(); // Güvenli silme işlemi
                System.out.println("Veli silindi.");
            }
        }

        System.out.println("Yeni Liste: " + isimler);
    }
}
