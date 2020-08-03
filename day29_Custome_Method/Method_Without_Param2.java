package day29_Custome_Method;

public class Method_Without_Param2 {
    public static void main(String[] args) {

        /*
        print hello world 5 times
        print your school name
        print hello 5 times
        print your name
        print hello world 5 times again
         */

        printHello();
        System.out.println("Cybertek");
        printHello();
        System.out.println("Alla");
    }

    public static void printHello() {

        for (int i = 10; i >= 6; i--) {
            System.out.println("Hello world");
        }
    }
}
