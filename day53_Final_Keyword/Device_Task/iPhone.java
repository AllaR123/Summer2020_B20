package day53_Final_Keyword.Device_Task;

public class iPhone extends Device {

    /*
    creata a subclass of Phone called iPhone
                initialize all the variables using constructor & static block
                    if price is higher than $1500, throw a runtime exception with a message of "Iphone' price cannot be higher than $1500"
                methods: call, text, toString, faceTime
     */

    public iPhone(String model, double price){
        super(model, price); // set the model, price
    }

    static{
        brand = "iPhone";
        madeIn = "USA";
    }

    @Override
    public void  call(long phoneNumber){
        System.out.println("iPhone "+model+" is calling: "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber){
        System.out.println("iPhone "+model+" is texting: "+phoneNumber);
    }
}
