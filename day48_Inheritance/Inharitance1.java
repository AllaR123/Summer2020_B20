package day48_Inheritance;

public class Inharitance1 {

    static class A {
        static int a = 10;

    }

    static class B extends A {
        static int b = 20;
    /*
    variables: a, b
     */

    }

    static class C extends B {
        static int c = 30;
    /*
    variables: a, b, c
     */

    }

}