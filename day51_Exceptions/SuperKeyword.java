package day51_Exceptions;

class Test {

    int a;      // 200

    public void method1() {
        System.out.println("Hello");
    }
}

public class SuperKeyword  extends Test {

    // a = 300;

    public void print1() {

        System.out.println(a);      // SuperKeyword' a ==> 300
    }



    public void print2() {

        System.out.println(super.a);    //  calling a from super class. Test' a ==> 200
    }

    public void method2() {
        super.method1();
        System.out.println("Hola");
    }

    public void method3(){
        this.method2();
        super.method1();
    }

    public static void main(String[] args) {

        Test obj1 = new Test();
        obj1.a = 200;

        SuperKeyword obj2 = new SuperKeyword();
        obj2.a = 300;


        obj2.print1();      // 300
        obj2.print2();      // 300 (has to be 200)

        obj2.method2();     // Hello. Hola
        System.out.println("=================================================");
        obj2.method3();     // Hello. Hola. Hello

    }

}

