package day46_ConstructorCall;

import day45_Constructor.Constructor;

public class ConstructorCall {

    public ConstructorCall() {

        method1();
        method2();
        method3();

    }

    public static void method1() {
        method2();

    }

    public static void method2() {
        method1();
    }

    public void method3() {


    }
}
