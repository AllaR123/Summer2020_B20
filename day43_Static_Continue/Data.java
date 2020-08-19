package day43_Static_Continue;

import java.util.ArrayList;

public class Data {

    static int[] arr = new int[3];
    static {
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
    }


    static  ArrayList<Integer> list = new ArrayList<>();

    static {
        list.add(4);
        list.add(5);            // called in class Test
        list.add(6);

    }




}
