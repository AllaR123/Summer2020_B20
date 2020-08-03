package day37_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;

public class Practice {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,2,2,3,3,4,5,6,6,6,6,7));


        // remove all the numbers that are less than 5


        list.removeAll(Arrays.asList(1,2,3,4));
        System.out.println(list);
    }
}
