package day58_Polymorphism_Continue;

import day55_Abstraction_2.ShapePackage.Circle;
import day55_Abstraction_2.ShapePackage.Cylinder;
import day55_Abstraction_2.ShapePackage.Rectangular;
import day55_Abstraction_2.ShapePackage.Shape;
import day58_Polymorphism_Continue.AnimalTask.Animal;
import day58_Polymorphism_Continue.AnimalTask.Cat;
import day58_Polymorphism_Continue.AnimalTask.Dog;

public class InstanceOf_Keyword {

    public static void main(String[] args) {

        Animal animal = new Animal(10, 'F');
        Animal animal2 = new Dog(7, 'M', "Tyson");
        Animal animal3 = new Cat(12, 'F', "Alisa");

        // verify animal3 is the object of Animal class
        boolean r1 = animal3 instanceof Animal; // IS A relation
        System.out.println(r1);             // true

        // verify animal3 is the object of Cat class
        boolean r2  = animal3 instanceof Cat;
        System.out.println(r2);             // true

        // verify animal3 is the object of Dog class
        boolean r3 = animal3 instanceof Dog; // there is no "IS A relation" ==> false
        System.out.println(r3);             // false

        boolean r4 = animal2 instanceof Animal;  // Dog is Animal
        System.out.println(r4);             // true

        System.out.println(animal2 instanceof Dog); // Dog is Dog       true

        System.out.println(animal instanceof Dog); // Animal is A Dog   false

        System.out.println(animal2 instanceof Cat); // Dog is Cat       false

        System.out.println("===============================================");

        Shape shape1 = new Circle(3);
        identifyShape(shape1);

        Circle c1 = new Circle(3);
        Circle c2 = new Circle(5);

        System.out.println(equalShapes(c1, c2));

        System.out.println("===============================================");

        Rectangular a1 = new Rectangular(3,5);
        Rectangular a2 = new Rectangular(3,5);

        System.out.println(equalShapes(a1, a2));


    }

    public static void identifyShape(Shape shape) {

        if(shape instanceof Circle) {
            System.out.println("The shape is circle");
        } else if(shape instanceof Cylinder) {
            System.out.println("The shape is cylinder");
        } else {
            System.out.println("The shape is rectangle");
        }
    }

    public static boolean equalShapes(Shape shape1, Shape shape2) {

        boolean result = false;
        boolean bothCircle = shape1 instanceof Circle && shape2 instanceof Circle;
        boolean bothRectangle = shape1 instanceof Rectangular && shape2 instanceof Rectangular;
        boolean bothCylinder = shape1 instanceof Cylinder && shape2 instanceof Cylinder;

        if(bothCircle) {
            Circle c1 = (Circle)shape1;
            Circle c2 = (Circle)shape2;
            if(c1.radius == c2.radius) {
                result = true;
            }
        }


        if(bothRectangle) {
            Rectangular r1 = (Rectangular)shape1;
            Rectangular r2 = (Rectangular)shape2;

            if(r1.length == r2.length && r1.width == r2.width) {
                result = true;
            }
        }

        if(bothCylinder) {
            Cylinder c1 = (Cylinder)shape1;
            Cylinder c2 = (Cylinder)shape2;

            if(c1.radius == c2.radius && c1.height == c2.height) {
                result = true;
            }
        }

        return result;


    }
}
