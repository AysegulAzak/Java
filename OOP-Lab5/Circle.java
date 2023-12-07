public class Circle {
    private static final double PI = 3.141519;
    private double Radius;

    public Circle(double radius) {
        this.Radius = radius;
    }

    public double getRadius() {
        return Radius;
    }

    public double computeArea() {
        double Area;
        Area = PI * (Radius * Radius);
        return Area;
    }
}

