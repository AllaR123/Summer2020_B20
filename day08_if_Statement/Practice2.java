package day08_if_Statement;

public class Practice2 {

    public static void main(String[] args) {

        int c = 5;
        boolean r2 = c++ == 6 || c-- == 5;      // 5 == 6 || 6 == 5 false false
        System.out.println(r2);     // false


        boolean A = true;
        boolean B = !A; // false

        boolean C = A != B && A == !B && !A == B;       // true  && true  && true
        System.out.println(C);         // true


        System.out.println("-------------------------------");

        double num1 = 20;
        double num2 = 80;
        double sum = (num1 + num2) * 25;

        double rem = sum  % 40;

        boolean r = rem <= 20;
        System.out.println(r);          // true
        System.out.println(rem);

    }
}
