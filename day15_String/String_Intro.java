package day15_String;
import  java.lang.String;

public class String_Intro {

    public static void main(String[] args) {

        String s1 = "Cat";                  // store in the String Pool
        String s2 = "Cat";                  // String literal --> doe not take duplicates in String literal

        System.out.println(s1 == s2);       // true

        String d1 = "Dog";
        String d2 = "dog";

        System.out.println(d1 == d2);       // false

        String t1 = new String("Cyber");
        String t2 = new String("Cyber");
        System.out.println(t1 == t2);           // false


        System.out.println("=====================================");

        String c1 = "Cybertek";         // String pool
        String c2 = new String("Cybertek");     // heap memory
        String c3 = new String("Cybertek");
        String c4 = "Cybertek";
        String c5 = "cybertek";

        System.out.println(c1 == c2);   // false
        System.out.println(c2 == c3);   // false
        System.out.println("---------------------------------");
        System.out.println(c1.equals(c2));   // true
        System.out.println(c1 == c5);   // false
    }
}
