package day62_Maps;

import day55_Abstraction_2.ShapePackage.Circle;

public class GarbageCollectionReview {

    public static void main(String[] args) {

        String str1 = "Cybertek";
        str1 = null;        // str1 does not refer to the Cybertek anymore, finalize method will be called implicitly for it
        System.out.println(str1);


        String s1 = new String("John");
        String s2 = new String("Doe");
        s1 = s2;
        System.out.println(s2);     // Doe
        System.out.println(s1);     // Doe

        System.out.println("====================================");

        Circle c1 = new Circle(3);
        c1 = null;
        System.out.println(c1);     // nullColor
    }
}
