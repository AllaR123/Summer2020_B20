package day53_Final_Keyword.Device_Task;

public class Device {

    /*
    1. create a class called Device
                Attributes: brand (static & do not initialize)
                            Model, price, screenSize
                            create a constrcutor that can initialize the instances
        2. create a sub class of Device called Phone
                static variables: brand , OperatingSystem, made in(do not initialize them)

                instance variables:     Model, price, screenSize, touchScreen(boolean)
                        add a constructor that can initialize all instances (this is should be the only constructor)
                            if price is lower than $0 throw a runtime exception with a message of "Invalid Price"
                methods: call, text, toString
        2. creata a subclass of Phone called iPhone
                initialize all the variables using constructor & static block
                    if price is higher than $1500, throw a runtime exception with a message of "Iphone' price cannot be higher than $1500"
                methods: call, text, toString, faceTime
        3. creata a subclass of Phone called Samsung
                initialize all the variables using constructor & static block
                    if price is higher than $1000, throw a runtime exception with a message of "Samsung phone' price cannot be higher than $1000"
                methods: call, text, toString, freeze
        4. creata a subclass of Phone called Nokia
                initialize all the variables using constructor & static block
                    if price is higher that $50, throw a runtime exception with a message of "Nokia Phone' price cannot be higher than $50"

                methods: call, text, toString, breakTheFloor
        5. create a class called phone objects:
                         create three objects of each phone and test everything out
     */

    public static String brand;
    public static String madeIn;

    public String model;
    public double price;

    public Device(String model, double price){
        this.model  = model;
        this.price = price;
    }

    protected void call(long phoneNumber){
        System.out.println("Phone is calling: "+phoneNumber);
    }

    protected void text(long phoneNumber){
        System.out.println("Phone is texting to: "+phoneNumber);
    }

    public String toString(){
        return "Brand: "+brand+" Model: "+model+" Price: $"+price+" Made in: "+madeIn;
    }


}
