package day09_if_Statement;

public class Warm_Up_2 {

    public static void main(String[] args) {

        /*
        warmup tasks:

    1. write a java program that accepts three numbers and return the maximum number
                (assume that none of them are equal)
    2. write a java program that accepts three numbers and return the minimum number
                (assume that none of them are equal)
    3. write a java program that accepts three numbers and return the medium number
                (assume that none of them are equal)
    4. write a java program that can identify if a person is eligible to buy alcohol
         */

        // 1
        int num1 = 35;
        int num2 = 7;
        int num3 = 29;

        boolean aIsMax = num1 > num2 && num1 > num3;        // false
        boolean bIsMax = num2 > num1 && num2 > num3;        // false
        boolean cIsMax = !aIsMax && !bIsMax;


        String max = " is a maximum number";
        int maximum = 0;

        if(aIsMax) {
          maximum = num1;
        } if(bIsMax) {
           maximum = num2;
        } if(cIsMax) {
           maximum = num3;
        }
        System.out.println(maximum + max);
//
//        if(num1 > num2 && num1 > num3) {
//            System.out.println(num1 + " is a maximum number");
//        } if(num2 > num1 && num2 > num3) {
//            System.out.println(num2 + " is a maximum number");
//        } if(num3 > num1 && num3 > num2) {
//            System.out.println(num3 + " is a maximum number");
//        }


        // 2

        int n1 = 7;
        int n2 = 12;
        int n3 = 100;

        if(n1 < n2 && n1 < n3) {
            System.out.println(n1 + " is a minimum number");
        } if(n2 < n1 && n2 < n3) {
            System.out.println(n2 + " is a minimum number");
        } if(n3 < n1 && n3 < n2) {
            System.out.println(n3 + " is a minimum number");
        }


        // 3

        int number1 = 17;
        int number2 = 100;
        int number3 = 40;

        String mid = "";
        
        if(number1 > number2 && number2 < number3) {
            System.out.println(number2 + mid);
        } if(number1 > number2 && number1 < number3) {
            System.out.println(number1 + mid);
        } if(number3 > number1 && number3 < number2) {
            System.out.println(number3 + mid);
        }

        // 4
        int age = 19;
        boolean hasID = true;

        String result = "";

        if(age >=21 && hasID == true) {
            result = "This person is eligible to buy alcohol";
        } else {
            result = "Sorry, no alcohol for you yet";
        }

        System.out.println(result);
    }
}
