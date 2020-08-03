package day07_Unary_ShortHand;

public class Positive_Negative_0 {

    public static void main(String[] args) {

        int a = 20;
        a = --a;
        System.out.println(a);      // 19

        int b = 10;
        b++;
        System.out.println(b);      // 11

        int x = 100;
        System.out.println(++x);    // 101

        int y = 100;
        System.out.println(y++);    // 100

        int c = 200;
        System.out.println(--c);    // 199
    }
}
