package day36_ArrayList_Continue;

import java.util.ArrayList;

public class Set_Method {

    public static void main(String[] args) {

        /*
        write a program that can set the last element of the Integer Arraylist to zero
            ex:
                list = [1,2,3,4,5];
                output: [1,2,3,4,0];
         */

        ArrayList<Integer> list1 = new ArrayList<>();

        list1.add(1);
        list1.add(2);
        list1.add(3);
        list1.add(4);
        list1.add(5);

        list1.set(4, 0);
        System.out.println(list1);

        System.out.println("=========================================");

        ArrayList<Integer> list2 = new ArrayList<>();
        for(int i = 0; i <= 10; i++) {
            list2.add(i);
        }
        System.out.println(list2);      // [0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10]

        for(int i = 0; i <= list2.size()-1; i++) {
            Integer each = list2.get(i);

            if(each % 2 != 0) {
                list2.set(i, each*2);
            } else {
                list2.set(i, each*3);    // [0, 2, 6, 6, 12, 10, 18, 14, 24, 18, 30]
            }
        }

        System.out.println(list2);


    }
}
