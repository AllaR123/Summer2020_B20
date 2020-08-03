package day37_ArrayList_Continue;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Practice_Lambda {

    public static void main(String[] args) {

        // write a program that can remove the elements that are not unique from the ArrayList
        // do not use loop AT ALL.


        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(1,1,2,2,3,3,4,5,6,7));
        list.removeIf(p -> Collections.frequency(list, p)!=1);
        System.out.println(list);                               // [4, 5, 6, 7]
    }
}
