package OOP_Advanced;

// final class: Miras alınamaz (extends edilemez)
final class SabitSinif {
    void test() {
        System.out.println("Test");
    }
}

class Parent {
    // final method: Override edilemez (ezilemez)
    final void degistirilemezMetot() {
        System.out.println("Bu kural değiştirilemez!");
    }
}

class Child extends Parent {
    // HATA: void degistirilemezMetot() { ... }
}

public class FinalKeyword {
    public static void main(String[] args) {
        // final değişken: Değeri değiştirilemez (sabit/constant)
        final double PI = 3.14159;
        // PI = 3.15; // HATA!

        System.out.println("PI: " + PI);

        Child c = new Child();
        c.degistirilemezMetot();
    }
}
