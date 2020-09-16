package day54_Abstraction.CarTAsk;

public class BMW extends Car {          // cannot make class Tesla an abstract, We need to create object from it
    @Override
    public void start() {
        System.out.println("push start button");
    }
}
