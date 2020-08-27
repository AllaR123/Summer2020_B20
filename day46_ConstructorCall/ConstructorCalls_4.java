package day46_ConstructorCall;

public class ConstructorCalls_4 {

    public ConstructorCalls_4() {

           // this(4.5);        cannot call or contain itself
    }

    public ConstructorCalls_4(int a) {

        this(2.5);


    }

    public ConstructorCalls_4(double a) {

        //   this(10);      cannot call or contain itself
        this();
    }
}