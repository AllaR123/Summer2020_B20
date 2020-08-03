package day11_Ternary_Nested_if;

public class Ternary_Practice {
    public static void main(String[] args) {


        // Find odd or even numbers
        int num = 100;
        String result = "";

//        if(num%2 == 0) {
//            result = "Even";
//        } else {
//            result = "Odd";
//        }

        String result2 = (num % 2 == 0) ? "Even" : "Odd";


        /*
        write a java program that can convert numbers between 0 ~ 9 to words,
        if the number is greater than 9 or less than zero, out put should be "Invalid".
        USE TERNARY ONLY
         */

        int input = 6;
        String res = "";

        String res2 = (input == 1) ? "one" : (input == 2) ? "two" : (input == 3) ? "three" : (input == 4) ? "four"
                : (input == 5) ? "five" : (input == 6) ? "six" : (input == 7) ? "seven" : (input == 8) ? "eight" : "Invalid";
        System.out.println(res2);


    /*
    Find  max number
     */

        int num1 = 10;
        int num2 = 20;

        int max = (num1 > num2) ? num1 : num2;
        System.out.println(max);

        /*
        Eligible to buy alcohol
         */

        int age = 20;
        boolean eligible = false;

        boolean el = (age >= 21) ? true : false;
        System.out.println(el);


    /*
    eligible to vote
     */

        int age2 = 18;
        boolean vote = false;

        boolean res5 = (age >= 18) ? true : false;
        System.out.println(res5);



    /*
    compare two numbers
     */

        int a = 10;
        int b = 20;

        String res8 = (a < b) ? a + " is less than b" : (a > b) ? a + " is greater than b" : "they are the same";
        System.out.println(res8);
    }

}