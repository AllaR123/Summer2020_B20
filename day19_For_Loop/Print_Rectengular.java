package day19_For_Loop;

public class Print_Rectengular {
    public static void main(String[] args) {

        /*
        print the following shape:
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
                * * * * * *
         */

        for(int i = 1; i <= 8; i++) {
            System.out.println("*" + " " + "*" + " "  + "*" + " " + "*" + " " + "*" + " " + "*");
        }

        System.out.println("=====================================");
        /*
        print the following shape:
                    * * * * * *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    *         *
                    * * * * * *
         */


        for(int j = 1; j <= 10; j++) {
        }
        System.out.println("* * * * * *");
        for(int i= 1;i<=8;i++){
            System.out.print("*\t\t  *\n");
        }
        System.out.println("* * * * * *");
    }
}
