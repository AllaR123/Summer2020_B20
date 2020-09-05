package day51_Exceptions;

class A {

    public void method2() {


    }

}

public class methodOverriding extends A{

    @Override
    public void method2() {                 // Acc Mod, name, parameters -->  MUST be the same in method overloading
                                            // return type --> MUST be the same
    }


    // toString --> implemented from he object, done implicitly; used to print
    @Override
    public String toString() {
        return "example";
    }
}
