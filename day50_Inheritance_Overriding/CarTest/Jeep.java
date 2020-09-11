package day50_Inheritance_Overriding.CarTest;

/*
call mechanic
oil change
jump start
 */

public class Jeep extends Car {

   @Override
    public void start() {

        System.out.println("Call mechanic");
        System.out.println("Oil change");
        System.out.println("Jump start");

    }
}
