package day53_Final_Keyword.Device_Task;

public class Sumsung extends Device {

    /*
    creata a subclass of Phone called Samsung
                initialize all the variables using constructor & static block
                    if price is higher than $1000, throw a runtime exception with a message of "Samsung phone' price cannot be higher than $1000"
                methods: call, text, toString, freeze
     */

    public Sumsung(String model, double price){
        super(model, price);
    }

    @Override
    public void call(long phoneNumber) {
        System.out.println("Samsung "+model+" is calling: "+phoneNumber);
    }

    @Override
    public void text(long phoneNumber) {
        System.out.println("Samsung "+model+" is texting: "+phoneNumber);
    }

    static{
        brand = "Samsung";
        madeIn = "Korea";
    }



}
