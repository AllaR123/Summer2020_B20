package day20_While_Loop;

public class WhileLoop {

    public static void main(String[] args) {


        // print numbers from 1-10


        for(int i = 1; i <= 10; i++) {
            System.out.print(i + " ");
        }
        System.out.println("=========================================");

        int num = 1;
        while (num <= 10) {
            System.out.print(num + " ");
            num++;
        }
        System.out.println();

        // print name 10 times


        int name = 1;
        while(name <= 10) {
            System.out.print("Alla" + " ");
            name++;
        }
        System.out.println("----------------------------------");

        // reverse a string

        String str = "Cybertek";

//        for(int i = str.length(); i > 0; i--) {
//
//        }

        int a = str.length()-1;
        while(a >= 0) {
            System.out.print(str.charAt(a) + " ");
            a--;
        }
    }
}
