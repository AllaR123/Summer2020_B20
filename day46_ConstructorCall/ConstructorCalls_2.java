package day46_ConstructorCall;

public class ConstructorCalls_2 {

    public ConstructorCalls_2() {

        System.out.println("A");
    }

    public ConstructorCalls_2(int a) {

        this();
        System.out.println("B");
    }

    public ConstructorCalls_2(String str) {

        this(3);
        System.out.println("C");

    }

    public static void main(String[] args) {

        new ConstructorCalls_2("Alla");     // A B C

    }
}
