package day08_if_Statement;

public class Logical {
    public static void main(String[] args) {

        boolean r1 = 9 > 7;     // true
        boolean r2 = !r1;       // false
        System.out.println(r1  + " : " + r2);
        System.out.println(!false);
        System.out.println(!true);

        boolean r3 = !false == true;
        System.out.println(r3);     // true

        boolean r4 = true == !true;
        System.out.println(r4);     // false


        boolean r5 = 9 > 5 && 10 > 10;
        System.out.println(r5);     // false
    }
}
