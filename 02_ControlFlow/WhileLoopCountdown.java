package ControlFlow;

public class WhileLoopCountdown {
    public static void main(String[] args) {
        int sayac = 10;

        // Koşul doğru olduğu sürece çalışır
        System.out.println("Geri sayım başlıyor...");
        while (sayac > 0) {
            System.out.println(sayac + "...");
            sayac--; // Sonsuz döngüye girmemesi için sayacı azaltmalıyız
        }

        System.out.println("BAŞLAT!");
    }
}
