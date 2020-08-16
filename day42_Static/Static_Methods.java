package day42_Static;

public class Static_Methods {

    int a = 200;
    static int b = 400;

    public static void main(String[] args) {

        System.out.println(b);              // no need to create an object
      //  System.out.println(a);        NONE static variable

        Static_Methods obj = new Static_Methods();
        System.out.println(obj.a);          // have to create an object to call instance variable

        staticMethod();
        Static_Methods.staticMethod();


    }

    public static void staticMethod() {


    }
}
