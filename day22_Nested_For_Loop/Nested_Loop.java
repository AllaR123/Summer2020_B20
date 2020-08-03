package day22_Nested_For_Loop;

import java.util.Scanner;

public class Nested_Loop {
    public static void main(String[] args) {

        /*
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         * * * * *
         */

        for(int i = 1; i <=7; i++) {
            for(int j = 1; j <= 5; j++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        /*
         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *
         */

        System.out.println("--------------------------------");
        for(int i = 1; i <= 7; i++){
            for (int k = 1; k <= i ; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }

        /*
         * * * * * *
         * * * * *
         * * * *
         * * * *
         * * *
         * *
         *
         */


        System.out.println("===================================");
        for(int j = 7; j >= 1; j--){
            for (int k = j; k >= 1 ; k--) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }


        System.out.println("-------------================----------------");

        int i = 1;
        int j = 1;
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        for(i = 1; i <= n; i++){
            for (j = 1; j <= i ; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
