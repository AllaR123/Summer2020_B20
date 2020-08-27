package day46_ConstructorCall;

public class ConstructorCalls_3 {

    public ConstructorCalls_3() {


    }

    public ConstructorCalls_3(int a) {

        this();
    }

    public ConstructorCalls_3(double a) {

        this();
        // this(4);      1 constructor can call ONLY 1 constructor
    }
}
