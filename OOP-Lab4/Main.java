import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        try {
            Worker worker1 = new Worker("Alice", 3000.0);
            Worker worker2 = new Worker("Charlie", 5000.0);
            Worker worker3 = new Worker("Bob", 1050.0);
            Worker worker4 = new Worker("Charlie", -5000.0);
            System.out.println("Total number of workers: " + Worker.getTotalWorkers());

            try {
                Scanner input = new Scanner(System.in);
                System.out.println("Please enter a number ");
                int Number = input.nextInt();
                System.out.println("Number you entered is: " + Number);
            } catch (InputMismatchException x) {
                System.out.println("Not a number");
            }
        } catch (IllegalArgumentException e) {
            System.out.println("Exception:  Salary amount must be greater than zero ");
        }
    }
}