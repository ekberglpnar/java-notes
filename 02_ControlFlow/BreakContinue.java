package ControlFlow;

public class BreakContinue {
    public static void main(String[] args) {
        System.out.println("--- BREAK Örneği ---");
        // Döngüyü tamamen kırar ve çıkar
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                System.out.println("i=5 oldu, döngü kırılıyor!");
                break;
            }
            System.out.println("Değer: " + i);
        }

        System.out.println("\n--- CONTINUE Örneği ---");
        // Sadece o anki adımı atlar ve devam eder
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                System.out.println("i=3 atlanıyor...");
                continue;
            }
            System.out.println("Değer: " + i);
        }
    }
}
