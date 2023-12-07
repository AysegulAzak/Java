public class Main {
    public static void main(String[] args) {
        Circle[] circles = new Circle[]{
                new Circle(5.0),
                new Circle(10.0),
                new Circle(15.0)
        };

        Teacher[] teachers = new Teacher[]{
                new Teacher(1, Branch.CS),
                new Teacher(2, Branch.ENG),
                new Teacher(3, Branch.MATH),
                new Teacher(4, Branch.PHYSICS)
        };

        for (Circle circle : circles) {
            double area = circle.computeArea();
            System.out.println("Circle - Radius: " + circle.getRadius() + ", Area: " + area);
        }
        System.out.println("*********************************************");
        for (Teacher teacher : teachers) {
            System.out.println("Teacher ID: " + teacher.getId() + ", Branch: " + teacher.getBranch() + " - " + teacher.getBranch().info);
        }
    }
}
