package day41_toString;

public class Cust_class_Carpet {

    /*
    warmup tasks:
    1. create a custom class for the Carpet class that should contain the following:

          instance variables:
                    width, length, unitPrice, isPersian (boolean)
          instance methods:

               customOrder(): sets the carpet' width, length, unitprice, & isParsian
               calcCost(): should be able to caculate the total cost of the carpet and return it as double
               getCarpetInfo(): should be able to display all the info of the carpet including the total cost of the carpet as calculated by calcCost()
            total price of carpet= (width*length)*unitprice
if the carpet is persian  carpet that's came from Turkey, add 200$ to the totalPrice
     */

    double width;
    double length;
    double unitPrice;
    boolean isPersian;


    public void customOrder(double width, double length, double unitPrice, boolean isPersian) {
        this.width = width;
        this.length = length;
        this.unitPrice = unitPrice;
        this.isPersian = isPersian;

    }

    public double calcCost() {

        double totalPrice = (width*length) * unitPrice;

        if(isPersian == true) {
            totalPrice += 200;
            return totalPrice;
        } else {
           return totalPrice;
        }
    }

    public void getCarpetInfo() {

        System.out.println("=================================");
        System.out.println("Width of the carpet: " + width);
        System.out.println("Length of the carpet: " + length);
        System.out.println("Price per unit: " + unitPrice);
        System.out.println("This carpet is: " + isPersian);
        System.out.println("Total price: " + calcCost());
        System.out.println("=================================");

    }

    public String toString() {

        return width + " " + length + " " + isPersian;

    }



}
