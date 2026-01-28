package ArraysStrings;

public class ArraySumAverage {
    public static void main(String[] args) {
        // Bir dizinin elemanlarının toplamını ve ortalamasını bulma
        double[] harcamalar = { 120.5, 45.0, 300.25, 10.0, 99.90 };

        double toplam = 0;

        for (double harcama : harcamalar) {
            toplam += harcama;
        }

        double ortalama = toplam / harcamalar.length;

        System.out.println("Toplam Harcama: " + toplam + " TL");
        System.out.println("Ortalama Harcama: " + ortalama + " TL");
    }
}
