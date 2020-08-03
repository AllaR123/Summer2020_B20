package day33_LocalDateTime;

public class Overloading {

    // WE CAN OVERLOAD ANY METHOD, EVEN MAIN METHOD

    public static void main(String[] args) {
        System.out.println("String array");     // String array gets executed

        int[] arr = {1,2,3};

        /*
        println, substring, indexOf, replace, sort, toString, equals .....
         */


    }

    public static void main(int[] a) {
        System.out.println("Int array");

    }

    public static void main(char[] ab) {
        System.out.println("Char array");

    }
}
