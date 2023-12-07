public class Worker {
    private String name;
    private double salary;
    private static int cnt=0;

    public Worker(String name,double salary){
        this.name=name;
        setSalary(salary);
        cnt++;
    }
    public void setSalary(double salary){
        if(salary<0)
            throw new IllegalArgumentException("Salary amount must be greater than zero");
        this.salary=salary;

    }

    public String setName(){
        return name;
    }

    public double getSalary(){
        return salary;
    }

    public static int getTotalWorkers(){
        return cnt;
    }
}
