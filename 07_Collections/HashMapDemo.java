package Collections;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        // HashMap: Anahtar-Değer (Key-Value) çiftleri tutar.
        // Plaka Kodları Örneği

        HashMap<Integer, String> plakalar = new HashMap<>(); // <KeyTipi, ValueTipi>

        plakalar.put(34, "İstanbul");
        plakalar.put(06, "Ankara");
        plakalar.put(35, "İzmir");
        plakalar.put(01, "Adana");

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
