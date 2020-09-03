package day50_Inheritance_Overriding.ShapeTask;

public class Rectangle extends Shape {

    /*
    Area of the rectangle:  width * length
    Perimeter of rectangle: (width + length) * 2
     */

        public int width;
        public int length;

    public Rectangle(int width, int length) {
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
    }

    public double calculateArea() {

        return width * length;

    }

    public double calculatePerimeter() {

        return (width * length) * 2;
    }

}
