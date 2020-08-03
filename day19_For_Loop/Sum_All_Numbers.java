package day19_For_Loop;

public class Sum_All_Numbers {
    public static void main(String[] args) {

        /*
        write a program that can calculate the sum of all numbers between 1 to 100
         */

        int sum1 =0;
        for (int i = 1; i <= 100; i++) {
            sum1 += i;
        }
        System.out.println(sum1);

        /*
        write a program that can calculate the sum of all the even numbers between 1 ~ 100
         */

        System.out.println("-------------------------------------");
        int sum2 = 0;
        for(int j = 2; j <= 100; j++) {
            if(j % 2 == 0) {
                sum2 += j;
            }
        }
        System.out.println(sum2);

        System.out.println();
        /*
        /*
        write a program that can calculate the sum of all the odd numbers between 1 ~ 100
         */
        System.out.println("******************************");

        int sum3 = 0;
        for(int r = 1; r < 100; r++) {
            if(r %2 != 0) {
                sum3 += r;
            }
        }
        System.out.println(sum3);
    }
}