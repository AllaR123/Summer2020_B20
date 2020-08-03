package day36_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Practice {

    public static void main(String[] args) {

        /*
        {30, 20, 40, 50, 15}

        output: 50 40 30 20 15
         */

        ArrayList<Integer> list = new ArrayList<>();

        list.add(30);
        list.add(20);
        list.add(40);
        list.add(50);
        list.add(15);

        Collections.sort(list);
        System.out.println(list);       // [15, 20, 30, 40, 50]

        ArrayList<Integer> descending = new ArrayList<>();

        for(int i = list.size()-1; i >= 0; i--) {
           // System.out.print(list.get(i) + " ");        // 50 40 30 20 15
            descending.add(list.get(i));
        }

        System.out.println(descending);                 // [50, 40, 30, 20, 15]


    }
}
