package day11_Ternary_Nested_if;

public class Ternary_Practice2 {

    public static void main(String[] args) {

        /*
        Write a program that will print out month names by receiving a number. Use ternary for conditions.

        Example:
        Display message: "Enter month number:"
        input: 5
        Display message: "May"

         */

//        int monthNum = 5;
//
//        String str = (monthNum == 1) ? "January" : (monthNum == 2) ? "Fabruary" : (monthNum == 3) ? "March"
//                : (monthNum == 4) ? "April" : (monthNum == 5) ? "May" : (monthNum == 6) ? "June"
//                : (monthNum == 7) ? "July" : (monthNum == 8) ? "August" : (monthNum == 9) ? "September"
//                : (monthNum == 10) ? "October" : (monthNum == 11) ? "November" : (monthNum == 12) ? "December"
//                : "Invalid month";
//        System.out.println(str);


        int day = 1;

        String str = (day == 1) ? "Monday" : (day == 2) ? "Tuesday" : (day == 3) ? "Wednesday"
                : (day == 4) ? "Thursday" : (day == 5) ? "Friday" : (day == 6) ? "Saturday"
                : "Sunday";
        System.out.println(str);

    }
}
