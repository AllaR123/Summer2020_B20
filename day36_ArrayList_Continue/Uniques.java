package day36_ArrayList_Continue;

import org.omg.CORBA.INTERNAL;

import java.util.ArrayList;

public class Uniques {

    /*
    write a program that can multiply each odd number by 2
            ex: list = [1,2,3,4,5];
                output: [2,2,6,4,10]
     */

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();  // {1,1,2,3,3}
        list.add(1);
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(3);
        list.add(4);

        ArrayList<Integer> uniques = new ArrayList<>(); // {2}

        for( Integer element: list){  // gets the each element from list
            int count = 0 ;
            for(Integer each : list){  // finds the frequency of element
                if(each == element){
                    count++;
                }
            }
            if(count == 1){  // to verify if  element is unique
                uniques.add(element);
            }
        }


        System.out.println(uniques);        // [2, 4]

    }
}
