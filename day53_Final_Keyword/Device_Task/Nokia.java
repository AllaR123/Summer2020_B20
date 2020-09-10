package day53_Final_Keyword.Device_Task;

public class Nokia extends  Device {

    /*
    creata a subclass of Phone called Nokia
                initialize all the variables using constructor & static block
                    if price is higher that $50, throw a runtime exception with a message of "Nokia Phone' price cannot be higher than $50"
                     methods: call, text, toString, breakTheFloor
     */

    public Nokia(String model, double price) {
        super(model, price);
    }

    static {
        brand = "Nokia";
        madeIn = "Finland";
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Nokia "+model+" is calling: "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Nokia "+model+" is texting to: "+phoneNumber);
    }

}
