// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
      // for
   for(int i=2; i<10; i+=2) {
            System.out.println(i);
        }
        System.out.println("For Döngüsü Bitti");

        // While
        int i = 2;
        while(i<=10){
            System.out.println(i);
            i+=2;
        }
        //infinite loop
        System.out.println("While Döngüsü Bitti");

        // Do-While
        int j = 1;
        do{
            System.out.println(j);
            j+=2;
        }while(j<10);
        System.out.println("Do-While Döngüsü Bitti");
    }
}