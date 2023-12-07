import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        System.out.println("Bir sayı giriniz: ");
        int sayi = scan.nextInt();
        int sayac = 0;

        if (sayi == 1) {
            System.out.println("Sayı asal değildir ");
            return;
        }
        if (sayi < 1) {
            System.out.println(" Geçersiz sayı ");
            return;
        }
        for (int i = 2; i < sayi; i++) {
            if (sayi % i == 0) {
                sayac++;
            }
        }
        if (sayac == 0) {
            System.out.println(sayi + " Asal bir sayıdır.");
        } else {
            System.out.println(sayi + " Asal bir sayı değildir");
        }
    }
}