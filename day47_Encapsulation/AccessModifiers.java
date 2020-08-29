package day47_Encapsulation;

import com.sun.tools.classfile.ConstantPool;

public class AccessModifiers {

    public static int publicVariable = 100;

    public static void publicMethod() {
        System.out.println("Public method");

    }


    static int defaultVariable = 100;

    static void defaultMethod() {
        System.out.println("Default method");
    }



    private static int privateVariable = 300;

    private void privateMethod() {
        System.out.println("Private method");
    }

    public static void main(String[] args) {

        System.out.println(publicVariable);
        System.out.println(defaultVariable);
        System.out.println(privateVariable);
    }

}
