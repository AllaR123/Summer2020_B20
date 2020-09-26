package day55_Abstraction_2.ShapePackage;

public final class Rectangular extends Shape {

    /*
    create a sub class of shape called Rectangle
            attributes: width, length, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the column)
            add a constructor that takes two arguments for W & L of rectangle the and initialize the instance variables: width, length, area, perimeter, volume
            add a static block that can initialize the static variables of the rectangle
     */

    public double width;
    public double length;

    static  {
       name = "Rectangular";
       hasVolume = false;

    }

    @Override
    public double calculateArea() {
        // width * length
        double calcArea = width * length;
        System.out.println("Area of the rectangular is: " + calcArea);
        return calcArea;
    }

    @Override
    public double calculatePerimeter() {
        // (width + length) * 2
        double calcPer = (width + length) * 2;
        System.out.println("Perimeter of the rectangular is : " + calcPer);
        return calcPer;
    }

    @Override
    public double calculateVolume() {
        return 0;

    }

    public Rectangular(double width, double length) {
        this.width = width;
        this.length = length;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();
    }

    @Override
    public String toString() {
        return "Rectangular{" +
                "width=" + width +
                ", length=" + length +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
