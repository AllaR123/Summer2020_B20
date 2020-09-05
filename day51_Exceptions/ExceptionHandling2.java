package day51_Exceptions;

import Library.Util;

public class ExceptionHandling2 {

    public static void main(String[] args) {

        try {
            System.out.println(10 / 0);
        } catch (Exception e) {
            System.out.println("Exceptions had been handled");
        }

        System.out.println("============================================");

        System.out.println("Hello");
        Util.sleep(3);
        System.out.println("World");
        Util.sleep(2);
        System.out.println("How are you");

    }
}
