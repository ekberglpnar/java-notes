package Basics;

public class TypeCasting {
    public static void main(String[] args) {
        // Otomatik Dönüştürme (Widening Casting) - Küçükten Büyüğe
        int myInt = 9;
        double myDouble = myInt; // Otomatik olarak 9.0 olur

        System.out.println("Int değeri: " + myInt);
        System.out.println("Double değeri (Otomatik dönüştürme): " + myDouble);

        // Manuel Dönüştürme (Narrowing Casting) - Büyükten Küçüğe
        double pi = 3.14;
        int tamPi = (int) pi; // (int) yazarak zorla tamsayıya çeviririz, veri kaybı olabilir

        System.out.println("Gerçek Double: " + pi);
        System.out.println("Int'e zorlanmış hali: " + tamPi); // 0.14 kaybolur
    }
}
