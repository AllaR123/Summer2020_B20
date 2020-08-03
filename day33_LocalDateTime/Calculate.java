package day33_LocalDateTime;

public class Calculate {

    /*
        1. create a method that can calculate the addition of two integers
        2. create a method that can calculate the addition of two decimals
        3. create a method that can calculate the multiplication of two integers
        4. create a method that can calculate the multiplication of two decimals
     */

    public static void main(String[] args) {

        System.out.println(addition(10,20));
        System.out.println(addition(2.2, 4.5));
        System.out.println(multiplication(3,4));
        System.out.println(multiplication(1.1, 4.5));

    }

    public static int addition(int num1, int num2) {
        return num1 + num2;
    }

    public static double addition(double num1, double num2) {
        return num1 + num2;
    }

    public static int multiplication(int num1, int num2) {
        return num1 * num2;
    }

    public static double multiplication(double num1, double num2) {
        return num1 * num2;
    }


}
