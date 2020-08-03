package day37_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Collections_Utility {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(30,22,67,90,100,4,8,12));


        // find max number
        Integer max = Collections.max(list);
        // find min number
        Integer min = Collections.min(list);

        System.out.println("Max: " + max);
        System.out.println("Min: " + min);

        System.out.println("=====================================");

        // replaceAll

        ArrayList<String> list2 = new ArrayList<>();
        list2.addAll(Arrays.asList("Muhtar", "Saim"));

        Collections.replaceAll(list2, "Muhtar", "Alla");
        System.out.println(list2);          // [Alla, Saim]


    }
}
