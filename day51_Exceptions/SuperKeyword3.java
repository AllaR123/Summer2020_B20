package day51_Exceptions;

class C {

    public C(int a) {
        System.out.println("Super class' int asr constructor");
    }

}

public class SuperKeyword3 extends C {

    public SuperKeyword3(double b) {        // we have to a constructor in sub class first to be able to call from super class
        super(300);
        System.out.println("Sub class' constructor with int arg");
    }

    public static void main(String[] args) {

        C obj1 = new C(100);                            // Super class' int asr constructor
        SuperKeyword3 obj2 = new SuperKeyword3(22.5);   // Super class' int asr constructor
                                                            // Sub class' constructor with int arg

    }

}
