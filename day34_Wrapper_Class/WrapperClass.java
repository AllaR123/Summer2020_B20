package day34_Wrapper_Class;

import java.util.Arrays;

public class WrapperClass {

    public static void main(String[] args) {

        Integer num = 100;
        int a = 100;                // this 2 are the same

        byte t = 100;
        int z = t;

        //Integer z2 = t;        cannot assign to wraper class not wraper one

        Byte b1 = 50;
        int n1 = b1;

        byte b2 = 40;
       // Integer n2 = b2;

        Integer n3 = new Integer(123);

        int[] arr = new int[3];
        System.out.println(Arrays.toString(arr));       // [0, 0, 0] we did not assign values


        int p1 = 300;
        Integer p2 = p1;    // Autoboxing

        Integer g1 = 500;
        int g2 = g1;        // Unboxing

        Double r1 = 300.0;
        double r2 = r1;


        Float f1 = 100.5f;
        Float f2 = f1;      // not Autoboxing or Unboxing


    }
}
