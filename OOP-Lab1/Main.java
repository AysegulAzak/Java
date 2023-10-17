import java.util.Scanner;
public class Main {
    public static void main(String[] args) {

        // Create a worker object of Worker class
        Worker w = new Worker();
        // Initialize the attributes of w
        w.wage = 200;
        w.name = "aysegul";
        w.workingHours = 160;
        w.socialSecurityNumber = 11111111;

        // Call function of w to display information of the w object
        w.displayInfo();
        w.displaySalary();

        // Create a worker object w2 of Worker class
        Worker w2 = new Worker();

        // Create a Scanner object scan to get input from keybord
        Scanner scan = new Scanner(System.in);

        // Print "Name of the worker: " to the screen
        System.out.print("Name of the worker: ");
        // Get name with using scan object nextLine function to get string value
        w2.name = scan.nextLine();
        System.out.print("Worker wage: ");
        // Get name with using scan object nextLine function to get float value
        w2.wage = scan.nextFloat();
        System.out.print("Worker working hours: ");
        // Get name with using scan object nextLine function to get integer value
        w2.workingHours = scan.nextInt();
        System.out.print("Worker social security number: ");
        w2.socialSecurityNumber = scan.nextInt();

        w2.displayInfo();
        w2.displaySalary();
    }
}