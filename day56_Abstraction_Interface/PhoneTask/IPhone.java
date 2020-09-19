package day56_Abstraction_Interface.PhoneTask;

public final class IPhone extends Phone {

    /*
    create the following subclasses of phone:
                        1. IPhone
            create constructors in each sub class that can initialize the instance variables
            if the price of iPhone or Samsung set to 0 or negative, program should throw an exception during runtime with
            an error message of "Invalid Price"
     */

    public IPhone( String model, double price, String size) {
        super("Iphone", model, price, size);
        if(price<=0 || price> 1500){
            throw new RuntimeException("Invalid Price: "+price);
        }
    }

    public IPhone(String brand, String model, double price, String size) {
        super(brand, model, price, size);
    }

    @Override
    public void calling(long phoneNumber) {
        System.out.println("Iphone is calling "+phoneNumber);
    }

    @Override
    public void calling(long num1, long num2) {
        calling(num1);
        calling(num2);
    }

    @Override
    public void texting(long phoneNumber) {
        System.out.println("Iphone is texting "+phoneNumber);
    }

    @Override
    public void texting(long num1, long num2) {
        texting(num1);
        texting(num2);
    }

    @Override
    public String toString() {
        return "Iphone phone{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", price=" + price +
                ", size='" + size + '\'' +
                '}';
    }

    public void faceTiming(long phoneNumber){ // only unique for ipnone
        System.out.println("Iphone is facetiming with "+phoneNumber);
    }

    public void faceTiming(long num1, long num2){
        faceTiming(num1);
        faceTiming(num2);
    }

}
