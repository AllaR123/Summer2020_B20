package day09_if_Statement;

public class Warm_Up {

    public static void main(String[] args) {

        /*
        Task01:
        write a program that can check if number is positive negative or equals to zero.
        for example:
            num  = 1
            prints:
                1 is positive number
            num = -6
            print:
                6 is negative number
            num = 0
            print:
                zero
         */

        int num = -6;
        if(num > 0) {
            System.out.println(num + " is positive number");
        } if(num < 0) {
            System.out.println(num + " is negative number");
        } if(num == 0) {
            System.out.println("zero");
        }

        /*
        Task02:
        write a program that can calculate the grade.
        1. if grade is bigger then 90 output "Excellent"
        2. if the grade is bigger then 70 and smaller then 90 output "Good"
        3. if grade is bigger then 60 and smaller then 70 output "Pass"
        4. if grade is smaller then 60 output "Fail"
        ex: score = 75
            output:
                Good
        HINT: you will need && logic
         */

        System.out.println("==============================");

        int grade =  75;

        if(grade >= 90) {
            System.out.println("Excellent");
        } if (grade >= 70 && grade < 90) {
            System.out.println("Good");
        } if(grade  >= 60 && grade < 70) {
            System.out.println("Pass");
        } if(grade < 60) {
            System.out.println("Fail");
        }

        /*
        Task03:
        Write a program that can calculate the grade based on the score
        if score is between 90 to 100 ==> A
        if score is between 80 to 90 ==> B
        if score is between 70 to 80 ==> C
        if score is between 60 to 70 ==> D
        if score is below 60 ==> F
        Ex: score = 85;
            output:
                Your grade is B
         */

        System.out.println("----------------------");

        int score = 85;

        if(score >= 90 && score <= 100) {
            System.out.println("A");
        } if(score >= 80 && score <= 90) {
            System.out.println("B");
        } if (score >= 70 && score <= 80) {
            System.out.println("C");
        } if( score >= 60 && score <= 70) {
            System.out.println("D");
        } if(score < 60) {
            System.out.println("F");
        }
    }
}
