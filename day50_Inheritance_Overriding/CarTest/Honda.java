package day50_Inheritance_Overriding.CarTest;

/*
insert the key, twist it to start
 */

public class Honda extends Car {

    @Override
    public void start() {

        System.out.println("Insert the key");
        System.out.println("twist to start");
    }


}
