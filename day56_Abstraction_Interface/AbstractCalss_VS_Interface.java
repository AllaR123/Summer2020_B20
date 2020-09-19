package day56_Abstraction_Interface;

public abstract class AbstractCalss_VS_Interface {

   private int a;
   protected static int b;

   public void method1() {

   }

   public abstract void method2();

   public static void method3() {

   }

    public AbstractCalss_VS_Interface(int a) {
        this.a = a;
    }

    static {

       b = 300;
    }

    {
        a = 400;
    }
}


interface A {


    // int a;       cannot have instance variable
   int a = 100;         // public static final --> by default(must be initialize)

    public abstract void method4();     // public abstract as an option

    static void method5() {      // can have static method

    }

    void method6();     // can have abstract method

    default void method7() {    // can have default method

    }

//    public A() {          cannot have constructor
//
//    }

}
