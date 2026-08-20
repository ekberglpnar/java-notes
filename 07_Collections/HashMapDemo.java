package Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // HashMap: Anahtar-Değer (Key-Value) çiftleri tutar.
        // Plaka Kodları Örneği

        HashMap<Integer, String> plakalar = new HashMap<>(); // <KeyTipi, ValueTipi>

        // DİKKAT: Sayının başına 0 yazmayın! Java bunu oktal (8'lik) sayı sayar.
        // put(06, ...) anahtarı 06 değil 6 olur; put(08, ...) ise derleme hatası verir:
        // "illegal digit in an octal literal". Bu yüzden plakalar baştaki sıfır olmadan yazılır.
        plakalar.put(34, "İstanbul");
        plakalar.put(6, "Ankara");
        plakalar.put(35, "İzmir");
        plakalar.put(1, "Adana");

        System.out.println("Plakalar: " + plakalar);

        // Anahtar ile değer çağırma
        System.out.println("34 Nerenin plakası? : " + plakalar.get(34));

        // Anahtar var mı kontrolü
        if (plakalar.containsKey(35)) {
            System.out.println("35 numara listede var.");
        }

        // Tüm anahtarları ve değerleri döngü ile gezme
        System.out.println("--- LİSTE ---");
        for (Integer key : plakalar.keySet()) {
            System.out.println("Plaka: " + key + " - Şehir: " + plakalar.get(key));
        }
    }
}
