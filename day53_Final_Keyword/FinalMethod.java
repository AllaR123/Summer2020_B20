package day53_Final_Keyword;

class  A{  // the class cannot have sub classes

    // public final A(){

    //      }



    public final void method1(){
        System.out.println("Enter username and password");
    }

    private final void method1(int a){
        System.out.println("No visible outside og the class");
    }


    public final static void method2(int b){
        System.out.println("Method 2 was called");
    }

}


public class FinalMethod extends A{

    /*
    @Override                       cannot be overriden, bc it's final
    public void method1(){
        System.out.println("Enter something else");
    }
*/

    public final static void main(String[] args) {
        System.out.println("Hello");


        FinalMethod finalMethod = new FinalMethod();
        finalMethod.method1();              // Enter username and password
        A.method2(2);                   // Method 2 was called

    }

}
