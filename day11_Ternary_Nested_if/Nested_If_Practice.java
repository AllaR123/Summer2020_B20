package day11_Ternary_Nested_if;

import com.sun.media.jfxmediaimpl.HostUtils;

public class Nested_If_Practice {
    public static void main(String[] args) {


        // days numbers according to their names

        int day = 5;
        boolean validNumbers = day >= 1 && day <= 7;
        String str = "";

        if(validNumbers) {
           if(day == 7) {
               str = "Sunday";
           } else if (day == 6) {
               str = "Saturday";
           } else if(day == 5) {
               str = "Friday";
           } else if (day == 4) {
               str = "Thursday";
           } else if(day == 3) {
               str = "Wednesday";
           } else if(day ==2) {
               str = "Tuesday";
           } else {
               str = "Monday";
           }
        } else {
             str = "Invalid";
        }
        System.out.println(str);




        /*
        In the Happy Valley School System, children are classified by age as follows:

        less than 2, ineligible
        2, toddler
        3-5, early childhood
        6-7, young reader
        8-10, elementary
        11 and 12, middle
        13, impossible
        14-16, high school
        17-18, scholar
        greater than 18, ineligible

        Given an int variable age, write an if statement that prints out, on a line by itself,
        the appropriate label from the above list based on age.

        Example:
        -Display prompt: Enter age:
        8
        -Display prompt: elementary
         */
        int age = 5;

        String string = (age < 2) ? "ineligible" : (age == 2) ? "toddler" : (age >= 3 && age <= 5) ? "early childhood"
                : (age == 6 && age == 7) ? "young reader" : (age >= 8 && age <= 10) ? "elementary"
                : (age == 11 && age == 12) ? "middle" : (age == 13) ? "impossible" : (age >= 14 && age <= 16) ? "high school"
                : (age == 17 && age == 18) ? "scholar" : "ineligible";
        System.out.println(string);


        /*
        The variable "num" holds an integer user input
        Write a conditional statement starting on line 9 that does the following:
        If num is positive, print "__ is positive"
        If num is negative, print "__ is negative"

        Examples:
        In: 5
        5 is positive
        In: -2
        -2 is negative
        In: 0
        (no output for zero)
         */

        int num = 0;

        String numbers = (num < 0) ? num + " is negative" : (num > 0)? num + "  is positive" : "";
        System.out.println(numbers);



        /*
        SDET Motors Inc. is recalling all vehicles from model years 1995-1998,  2001-2002,  2004-2006 and 2015-2017.

In this assignment you will write a program that will find vehicle for recall.
-Create a scanner object
-Create int variable named vehicleYear

-Display prompt: "Enter vehicle's year:"
input: 1996

 if the value of modelYear does fall within the four recall ranges, display output:
"Your vehicle needs to be recalled!"

Otherwise, display message:
"Your vehicle is fine, enjoy!"
         */

        int vehicleYear = 1996;
        String s = (vehicleYear >= 1995 && vehicleYear <= 1998)  ?  "Your vehicle needs to be recalled!"
                : (vehicleYear >= 2001 && vehicleYear <= 2002) ?  "Your vehicle needs to be recalled!"
                : (vehicleYear >= 2004 && vehicleYear <=2006) ?  "Your vehicle needs to be recalled!"
                : (vehicleYear >= 2015 && vehicleYear <= 2017) ? "Your vehicle needs to be recalled!"
                : "Your vehicle is fine, enjoy!";

        System.out.println(s);

    }
}
