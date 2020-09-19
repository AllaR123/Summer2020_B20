package day56_Abstraction_Interface;

import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

public interface Interface_Practice {

    int a = 100;            // a & b have the same declaration

    public static final int b = 200;

    static void method1() {
        System.out.println("This is static method");
    }

    public default void method2() {
        System.out.println("This is a default method");
    }

   void method3();      // abstract method

    public static void main(String[] args) {

        System.out.println(a);
        System.out.println(b);
        method1();

        Interface_Practice obj1 = new Interface_Practice() {        // method2,3 are not static, we have to override this methods
            @Override
            public void method2() {

            }

            @Override
            public void method3() {

            }
        };

/*
        static {            cannot have static blocks

        }

 */

    }
}
