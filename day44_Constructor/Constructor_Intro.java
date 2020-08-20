package day44_Constructor;

public class Constructor_Intro {


    public Constructor_Intro(String args) {

        System.out.println("Hello " + args);

    }

    public static void main(String[] args) {

        Constructor_Intro obj1 = new Constructor_Intro("Alla");
        Constructor_Intro obj2 = new Constructor_Intro("Denys");
        Constructor_Intro obj3 = new Constructor_Intro("Max");


    }
}
