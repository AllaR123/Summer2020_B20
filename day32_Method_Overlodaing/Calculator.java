package day32_Method_Overlodaing;

public class Calculator {

    /*
     write a return method that accepts two numbers and an operator, then returns calculation result.
             if the operator is invalid, return zero
             otherwise return the result
     */

    public static void main(String[] args) {

        double d = calculator(10, '*', 2);
        System.out.println(d);

    }

    public static double calculator(double num1, char oper, double num2) {

        double result = (oper == '+') ? num1 + num2 : (oper == '-') ? num1 - num2
                : (oper == '/') ?  num1/num2 : (oper == '*') ? num1 * num2 : (oper == '%') ? num1 % num2 : 0;

        return result;
    }


}
