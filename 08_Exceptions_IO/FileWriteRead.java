package Exceptions_IO;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class FileWriteRead {
    public static void main(String[] args) {
        try {
            // Dosya Oluşturma ve Yazma
            FileWriter writer = new FileWriter("not.txt");
            writer.write("Java ile dosya işlemleri öğreniyorum.\n");
            writer.write("Bu ikinci satır.");
            writer.close();
            System.out.println("Dosya başarıyla yazıldı.");

            // Dosya Okuma
            File dosya = new File("not.txt");
            Scanner reader = new Scanner(dosya);

            System.out.println("--- DOSYA İÇERİĞİ ---");
            while (reader.hasNextLine()) {
                String veri = reader.nextLine();
                System.out.println(veri);
            }
            reader.close();

        } catch (IOException e) {
            System.out.println("Bir dosya hatası oluştu.");
            e.printStackTrace();
        }
    }
}
