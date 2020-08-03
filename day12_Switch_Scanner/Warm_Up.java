package day12_Switch_Scanner;

public class Warm_Up {

    public static void main(String[] args) {

        /*
        Warmup tasks:
    1. write a program that checks for the bigger of 3 numbers.
        you get 3 int variables: n1 , n2 and n3 (none of them are equal)
            if n1 is biggest output: "n1 is bigger"
            if n2 is biggest output: "n2 is bigger"
            if n3 is biggest output: "n3 is bigger"
            example:
                    n1 = -2
                    n2  = 2
                    n3  = 1
                output: "n2 is bigger"
            NOTE: DO NOT USE IF STATEMENT
    2. write a program that can define the age groups of a person
            age groups are:
                    Teenager (< 21)
                    Adult   (>=21 && <55 )
                    Senior  ( > 55 )
                  age cannot be negative or greater than 150
                  NOTE: MUST APPLY NESTED IF
         */

        // 1
        int n1 = 5;
        int n2 = 4;
        int n3 = 3;

        boolean n1IsBigger = n1 > n2 && n1 > n3;
        boolean n2IsBigger = n1IsBigger == false && n2 > n3;

        String str = (n1IsBigger) ? "n1 is bigger" : (n2IsBigger) ? "n2 is bigger" : "n3 is bigger";
        System.out.println(str);


        // 2 nested if

        int age = 200;
        String ageGroup = "";

        if(age > 0 && age <= 150) {
            if(age < 21) {
                ageGroup = "Teenager";
            } else if(age <= 55) {
                    ageGroup = "Adult";
                    } else if(age > 55 ) {
                ageGroup = "Senior";
                }
            } else {
            ageGroup = "Invalid";
        }
        System.out.println(ageGroup);


        // 2 with ternary

        int age2 = 55;
        String ageGroup2 = "";

        if(age > 0 && age <= 150) {

            ageGroup2 = (age<21) ? "Teenager" : (age2<=55) ? "Adult" : "Senior";
        } else {
            ageGroup2 = "Invalid";
        }

        }

    }

