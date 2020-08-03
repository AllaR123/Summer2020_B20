package day36_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Collections;

public class Collections_Utility {

           /*
           Arrays: utility class for  Array
           Collections: class for Collection
            */

    public static void main(String[] args) {


        // sort()


        ArrayList<Integer> list = new ArrayList<>();

        list.add(20);
        list.add(15);
        list.add(10);
        list.add(40);
        list.add(30);

        Collections.sort(list);

        System.out.println(list);

        System.out.println("Maximum number: "+list.get( list.size()-1 )  );
        System.out.println("Minimum number: "+list.get(0));



        // swap()


        ArrayList<String> list2 = new ArrayList<>();

        list2.add("A");
        list2.add("B");
        list2.add("C");
        list2.add("D");
        list2.add("E");

        System.out.println(list2);              // [A, B, C, D, E]

        Collections.swap(list2, 1, 2);
        System.out.println(list2);              // [A, C, B, D, E]

        Collections.swap(list2, 0, list.size()-1);
        System.out.println(list2);              // [E, C, B, D, A]


        // frequency()


        ArrayList<Character> charList = new ArrayList<>();

        charList.add('A');
        charList.add('B');
        charList.add('A');
        charList.add('A');
        charList.add('E');

        int count = Collections.frequency(charList, 'A');
        System.out.println(count);             // 3

    }
}
