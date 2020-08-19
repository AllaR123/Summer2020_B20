package day43_Static_Continue;

import java.util.Arrays;
import  static Library.Resources.*;

public class Test {

    public static void main(String[] args) {

        System.out.println(Static_Block_3.a);       // 100
        System.out.println(Static_Block_3.b);       // 200
        System.out.println(Static_Block_3.c);       // 300


        System.out.println(Arrays.toString(Data.arr));
        System.out.println(Data.list);

        System.out.println("======================================================");

        System.out.println(a);
        method1();
    }

}
