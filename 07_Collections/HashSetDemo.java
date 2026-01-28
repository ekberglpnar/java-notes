package Collections;

import java.util.HashSet;

public class HashSetDemo {
    public static void main(String[] args) {
        // HashSet: Tekrarlı eleman barındırmaz ve sıralama garantisi vermez.
        HashSet<Integer> sayilar = new HashSet<>();

        sayilar.add(10);
        sayilar.add(20);
        sayilar.add(30);
        sayilar.add(10); // Tekrar eklenmeye çalışılıyor (Eklenmeyecek)
        sayilar.add(40);

        System.out.println("HashSet: " + sayilar); // Sırasız ve tekrarsız

        if (sayilar.contains(20)) {
            System.out.println("Listede 20 sayısı var.");
        }

        sayilar.remove(40);
        System.out.println("Silme sonrası: " + sayilar);
    }
}
