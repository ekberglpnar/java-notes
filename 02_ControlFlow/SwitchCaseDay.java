package ControlFlow;

import java.util.Scanner;

public class SwitchCaseDay {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Haftanın kaçıncı günü (1-7): ");
        int gun = scanner.nextInt();

        String gunIsmi;

        // Switch-Case yapısı
        switch (gun) {
            case 1:
                gunIsmi = "Pazartesi";
                break; // break demezsek aşağıdaki case'leri de çalıştırır!
            case 2:
                gunIsmi = "Salı";
                break;
            case 3:
                gunIsmi = "Çarşamba";
                break;
            case 4:
                gunIsmi = "Perşembe";
                break;
            case 5:
                gunIsmi = "Cuma";
                break;
            case 6:
                gunIsmi = "Cumartesi";
                break;
            case 7:
                gunIsmi = "Pazar";
                break;
            default:
                gunIsmi = "Geçersiz Gün";
                break;
        }

        System.out.println("Bugün: " + gunIsmi);
        scanner.close();
    }
}
