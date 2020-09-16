package day54_Abstraction.CarTAsk;
/*
    Car: abstract
        start();
    BMW
        start(): push start button
    Tesla
        start(): voice control
    Toyota
        start(): Insert the key
    Jeep
        start(): jump start
     */

public abstract class Car {

    public abstract void start();

}

final class A {


}

class B {

    public static void main(String[] args) {
        A obj1 = new A();
        //Car obj2 = new Car();         cannot create object from the abstract class, bc it's not concrete
    }
}
