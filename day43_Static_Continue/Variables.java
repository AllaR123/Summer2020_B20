package day43_Static_Continue;

public class Variables {

    public static void main(String[] args) {

       // System.out.println(a);    local variable NOT accessible outside the method

    }

    int d;                 // instance
    static int e;          // static

    public void method2() {

        System.out.println(d);
        System.out.println(e);

    }


    public static void method1() {

        int a;              //local
        int c = 10;         //local

        if(true) {
            int b = 20;
        }

       // System.out.println(b);       local variable NOT accessible outside the method
       // System.out.println(a);        did not initialize it yet
        System.out.println(c);
        //System.out.println(d);        static method does not excepts instance variables, ONLY static
        Variables var = new Variables();
        System.out.println(var.d);
    }


}
