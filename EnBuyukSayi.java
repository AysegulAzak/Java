// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
       int sayi1 = 1;
       int sayi2 = 2;
       int sayi3 = 3;
       int enBuyuk = sayi1;

       if(enBuyuk<sayi2) {
           enBuyuk = sayi2;
       }
       if(enBuyuk<sayi3){
           enBuyuk = sayi3;
       }
        System.out.println("En büyük = " + enBuyuk);
    }
}