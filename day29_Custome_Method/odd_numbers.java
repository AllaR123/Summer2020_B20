package day29_Custome_Method;

public class odd_numbers {
    public static void main(String[] args) {

        OddNum();
        System.out.println();
        EvenNum();

    }

    public static void OddNum() {

        for(int i =  1; i <= 100; i+=2) {
                System.out.print(i + " ");
        }
    }

    public static void EvenNum() {

        for(int i =  0; i <= 100; i++) {
                System.out.print(i + " ");
        }
    }


}
