package day32_Method_Overlodaing;

public class MethodOverloading2 {
    /*
    1. create a method that can find the addition of two numbers
                        addition2Numbers
    2. create a method that can find the addition of three numbers
                        addition3Numbers
    3. create a method that can find the addition of four numbers
                        addition4Numbers

     */

    public static void main(String[] args) {

        addition2Numbers(3.4, 5.6);
        addition2Numbers(3.4, 5.6, 1.2);
        addition2Numbers(3.4, 5.6, 1.2, 9.9);
    }

    public static void addition2Numbers(double a, double b) {
        System.out.println(a+b);
    }

    public static void addition2Numbers(double a, double b, double c) {
        System.out.println(a+ b + c);
    }

    public static void addition2Numbers(double a, double b, double c, double d) {
        System.out.println(a + b + c + d);
    }

}
