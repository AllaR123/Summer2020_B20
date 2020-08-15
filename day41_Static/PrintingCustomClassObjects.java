package day41_Static;

public class PrintingCustomClassObjects {

    public static void main(String[] args) {


        String str = new String("Alla");
        System.out.println(str.toString());   // object name
        System.out.println(new String("Rudenko").toString());       // object

        System.out.println("==============================================");

        Cust_class_Carpet c1 = new Cust_class_Carpet();
        c1.customOrder(5,6,17,true);


        // by creating toString method in Cust_class_Carpet Class, WE ARE ABLE TO PRINT OUR OBJECT
        System.out.println(c1);         // 5.0 6.0 true


    }
}