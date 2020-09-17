package day55_Abstraction_2.ShapePackage;

import day50_Inheritance_Overriding.ShapeTask.Rectangle;

public class ShapeObjects {

    public static void main(String[] args) {

            Circle circle = new Circle(2.5);
            System.out.println(circle);

            Rectangle rectangle = new Rectangle(10, 5);
            System.out.println(rectangle);

            Cylinder cylinder = new Cylinder(5, 10);
            System.out.println(cylinder);
    }
}
