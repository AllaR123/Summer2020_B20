package day10_if_else;

public class MultiBranch {

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

        int num = 100;

        if(num > 0) {
            System.out.println(num + " is positive number");
        } if(num < 0) {
            System.out.println(num + " is negative number");
        } if(num == 0) {
            System.out.println("zero");
        }
    }


}
