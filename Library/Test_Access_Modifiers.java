package Library;

import day47_Encapsulation.AccessModifiers;

public class Test_Access_Modifiers {
    public static void main(String[] args) {

        System.out.println(AccessModifiers.publicVariable);
        AccessModifiers.publicMethod();

//        System.out.println(AccessModifiers.defaultVariable);      NOT VISIBLE OUTSIDE OF THE PACKAGE
//        AccessModifiers.defaultMethod();

//        System.out.println(AccessModifiers.privateVariable);      PRIVATE IS NOT VISIBLE OUTSIDE OF THE CLASS
//        AccessModifiers.privateMethod();
    }

}
