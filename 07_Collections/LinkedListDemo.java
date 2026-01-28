package Collections;

import java.util.LinkedList;

public class LinkedListDemo {
    public static void main(String[] args) {
        // LinkedList: Bağlı liste yapısı.
        // Ekleme/Çıkarma işlemleri ArrayList'ten daha hızlıdır fakat erişim daha
        // yavaştır.

        LinkedList<String> liste = new LinkedList<>();

        liste.add("Elma");
        liste.add("Armut");
        liste.add("Muz");

        // Başa ve Sona ekleme (LinkedList'e özel metotlar)
        liste.addFirst("Çilek");
        liste.addLast("Kivi");

        System.out.println("Liste: " + liste);

        System.out.println("İlk Eleman: " + liste.getFirst());
        System.out.println("Son Eleman: " + liste.getLast());

        liste.removeFirst();
        liste.removeLast();

        System.out.println("Kırpılmış Liste: " + liste);
    }
}
