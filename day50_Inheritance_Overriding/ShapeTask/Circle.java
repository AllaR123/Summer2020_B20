package day50_Inheritance_Overriding.ShapeTask;

public class Circle extends Shape {

    /*
     Area of the circle:    3.14 * radius * radius
      Perimeter of circle:   3.14 * 2 * radius
     */

    public double radius;
    public double diameter;
    static double PI = 3.14;


    public Circle(double radius) {
        this.radius = radius;
        diameter = radius * 2;
        area = calculateArea();
        perimeter = calculatePerimeter();

    }

    public double calculateArea() {

        return radius * radius * 3.14;

    }

    public double calculatePerimeter() {

        return diameter * PI;
    }
}
