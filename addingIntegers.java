import java.util.Scanner; // program uses class Scanner

public class Main {
    public static void main(String[] args) {
        // create a Scanner to obtain input from the command window
        Scanner input = new Scanner(System.in);

        int number1;
        int number2;
        int sum;

        System.out.println("Enter first integer: "); // prompt
        number1 = input.nextInt(); // read first number from user

        System.out.println("Enter second integer: ");
        number2 = input.nextInt(); // read second number from user

        sum = number1 + number2; // add numbers, then store total in sum

        System.out.printf("Sum is %d%n", sum); // display sum
    } // end method main
} // end class Main
