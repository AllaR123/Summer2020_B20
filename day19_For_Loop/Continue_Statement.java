package day19_For_Loop;

public class Continue_Statement {
    public static void main(String[] args) {

        for(int i =  1; i <= 5; i++) {
            if(i == 3) {
                continue;               // skip

            }
            System.out.println(i);      // 1,2,4,5
        }

        // print even numbers (skip odd numbers)
        System.out.println("-----------------------------------");
        for(int i = 0; i <= 50; i++) {
            if(i % 2 != 0)  {
                continue;
            }
            System.out.println(i);
        }

        // print odd numbers (skip even numbers)
        System.out.println("===================================");
        for(int i = 0; i <= 50; i++) {
            if(i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }


    }
}
