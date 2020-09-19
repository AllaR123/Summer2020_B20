package day56_Abstraction_Interface.PhoneTask;

public final class Samsung extends Phone {

    /*
    create the following subclasses of phone:
                       2. Saumsung
            create constructors in each sub class that can initialize the instance variables
            if the price of iPhone or Samsung set to 0 or negative, program should throw an exception during runtime with
            an error message of "Invalid Price"
     */

    public Samsung( String model, double price, String size) {
        super("Samsung", model, price, size);
        if(price <= 0 || price >1200){
            throw new RuntimeException("Invalid Price: "+price );
        }

    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Samsung is calling "+phoneNumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Samsung is texting to "+phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }


    public void freezing(){
        System.out.println("Samsung is freezing");
    }

    @Override
    public String toString() {
        return "Samsung Phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price= $" + price +
                ", size='" + size + '\'' +
                '}';
    }

}
