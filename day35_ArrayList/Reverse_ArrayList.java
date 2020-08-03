package day35_ArrayList;

import java.util.ArrayList;
import java.util.List;

public class Reverse_ArrayList {

    /*
    write a program that can print the list of integers in reversed order
        ex:
            list=> {1,2,3,4,5}
            output: 5 4 3 2 1
     */

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        for (Integer i = list.size()-1; i >= 0; i--) {
            System.out.print(list.get(i) + " ");
        }


        // Another way


        /*
        int[] list = {1,2,3,4,5};
        ArrayList <Integer> reverse = new ArrayList<>();
        for (int i = list.length-1; i >= 0; i--){
            reverse.add(list[i]);
        }
​
        System.out.println(reverse);
         */
    }
}
