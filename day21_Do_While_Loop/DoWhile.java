package day21_Do_While_Loop;

public class DoWhile {
    public static void main(String[] args) {

        // print numbers from 1-20 using do-while loop

        int i=1;
        do
        {
            System.out.print(i+" ");
            i++;
        }while(i<=20);
        System.out.println();
        System.out.println(i);



        System.out.println("================================");


        char ch = 'Z';

        do {

            System.out.print(ch + " ");
            ch--;

        } while(ch >= 'A');


    }
}
