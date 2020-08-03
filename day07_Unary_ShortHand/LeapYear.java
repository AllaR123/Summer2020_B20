package day07_Unary_ShortHand;

public class LeapYear {

    public static void main(String[] args) {

        /*
        1. create a class called LeapYear, and write a program that can identify if the given is Leap Year,
        print true if it's leap year, otherwise print false
        Ex:
            year = 2020  ==> short;
            LeapYear =true/false;
        output:
            2020 is leap year: true
            Assume that any year that can be divisible by 4 is leap year
         */

        short year = 2020;
        boolean LeapYear = year % 4 == 0;
        System.out.println(LeapYear);               // true

        /*
        2. write a program that can check if a number is evenly divisible by 2, 3, 5
            Ex:
                number = 65;

            output:
                65 is divisible by 2: false
                65 is divisible by 3: false
                65 is divisible by 5: true
         */

        int number = 65;
        boolean n1 = number % 2 == 0;
        boolean n2 = number % 3 == 0;
        boolean n3 = number % 5 == 0;
        System.out.println(n1 + ", " + n2 + ", " + n3);               //  false


    }
}
