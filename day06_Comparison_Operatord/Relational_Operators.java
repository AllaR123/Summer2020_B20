package day06_Comparison_Operatord;

public class Relational_Operators {

    public static void main(String[] args) {

        int number = 100;
        boolean even = number % 2 == 0;
        System.out.println(even);           // true

        boolean odd = number % 2 != 0;
        System.out.println(odd);            // false

        int x = 100;
        boolean y = x % 3 == 0;
        System.out.println(y);              // false
    }
}
