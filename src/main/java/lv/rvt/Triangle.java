package lv.rvt;

public class Triangle extends GeometricShape {
    private double a;
    private double b;
    private double c;

    public Triangle(double a, double b, double c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    @Override
    public double getArea() {
        return (a+b+c)/2;
    }

    @Override
    public double getPerimeter() {
        return a+b+c;
    }

    @Override
    public void displayInfo() {
        System.out.println("Triangle sides: " + a + ", " + b + ", " + c);
        System.out.println("Triangle area: " +  getArea());
        System.out.println("Triangle perimeter: " + getPerimeter());
    }
}
