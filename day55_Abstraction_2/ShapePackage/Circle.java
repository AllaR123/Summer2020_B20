package day55_Abstraction_2.ShapePackage;

public final class Circle extends Shape {

    /*
    2. create a sub class of shape called Circle (meant to be subclass ONLY)
            attributes: radius, name(static), area, perimeter, hasVolume(static), volume
            override the abstract methods
            (if the shape does not have volume, return 0 for the column)
            add a constructor that takes an argument for radius of the circle and initialize the instance variables: radius, area, perimeter, volume
            add a static block that can initialize the static variables of the circle
     */


    public double radius;
    public static double PI;

    static  {
       name = "Circle";
       hasVolume = false;
       PI = 3.14;
    }


    @Override
    public double calculateArea(){
        return Math.pow(radius, 2) *  Math.PI;
    }

    @Override
    public double calculatePerimeter(){
        return radius*2*Math.PI;
    }

    @Override
    public double calculateVolume(){
        return 0;
    }

    public Circle(double radius) {
        this.radius = radius;
        area = calculateArea();
        perimeter = calculatePerimeter();
        volume = calculateVolume();

    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                ", area=" + area +
                ", perimeter=" + perimeter +
                ", volume=" + volume +
                '}';
    }
}
