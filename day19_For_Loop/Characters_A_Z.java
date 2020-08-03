package day19_For_Loop;

public class Characters_A_Z {
    public static void main(String[] args) {

        /*
        Print letters from A-Z in ascending order
         */

        for(char ch = 'A'; ch <= 'Z'; ch++) {
            System.out.print(ch + " ");
        }

        /*
        Print letters from A-Z in descending order
         */

        System.out.println();
        for(char ch = 'Z'; ch >= 'A'; ch--) {
            System.out.print(ch + " ");
        }

    }
}
