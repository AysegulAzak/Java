// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        int number = 17;
        int remainder = number % 1;
        // System.out.println(remainder);
        boolean isPrime = true;

        if (number == 1) {
            System.out.println("Sayı asal değildir ");
            return;
        }
        if (number < 1) {
            System.out.println("Geçersiz sayı");
            return;
        }
        for (int i = 2; i < number; i++) {
            if (number % i == 0) {
                isPrime = false;
            }
        }
        if (isPrime) {
            System.out.println("Sayı asaldır");
        } else {
            System.out.println("Sayı asal değildir");
        }
    }
}