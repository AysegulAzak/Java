public class Worker {
    String name;
    int socialSecurityNumber;
    float wage;
    int workingHours;
    void displayInfo()
    {
        System.out.println("Name: " + name);
        System.out.println("Social security number: " + socialSecurityNumber);
    }
    void displaySalary()
    {
        System.out.println("Salary: " + wage * workingHours);
    }

}
