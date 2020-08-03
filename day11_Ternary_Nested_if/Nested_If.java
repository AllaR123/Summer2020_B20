package day11_Ternary_Nested_if;

public class Nested_If {
    public static void main(String[] args) {

        /*
        90 ~ 100 ==> A
        80 ~ 89 ==> B
        70 ~ 79 ==> C
        60 ~ 69 ==> D
        otherwise ==> F
         */

        System.out.println("===============================");

        int score = 78;
        String result = "";

        if(score >= 0 && score <= 100) {
            if(score >= 90) {
                result = " A";
            } else if(score >= 80) {
                result = "B";
            } else if(score >= 70) {
                result = "C";
            } else if(score >= 60) {
                result = "D";
            } else {
                result = "F";
            }
        }
        System.out.println(result);


        // Display x if x is greater than or equal to 5
        // Display -x if x is less than 5

        System.out.println("--------------------------");
        int x = 3;

        int str1 = (x >= 5) ? x : -x;
        System.out.println(str1);


        /*
        Write an expression using the conditional operator (? :) that compares the values of the variables num1 and num2.
        The result (that is the value) of this expression should be the value of the larger of the two variables.
        The larger value should be printed out.
         */

        int num1 = 150;
        int num2 = 100;

        int res = 0;

        int n = (num1 > num2) ? res + num1 : res + num2;
        System.out.println(n);



    }
}
