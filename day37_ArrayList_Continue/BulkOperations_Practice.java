package day37_ArrayList_Continue;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.Arrays;

public class BulkOperations_Practice {

    public static void main(String[] args) {

        // containsAll(): --> boolean

        ArrayList<String> students = new ArrayList<>();
        students.add("Sayeem");
        students.add("Waqar");
        students.add("Beslan");
        students.add("Dawud");
        students.add("Ramazan");
        students.add("Mehary");



        // verify that the names Ulku, Busra are contained in students list
        boolean r1 = students.containsAll(  Arrays.asList("Ulku", "Busra", "Muhtar")   );

        System.out.println(r1);         // false

        System.out.println("======================================");



        // addAll(): --> adds the  elements


        ArrayList<String> group1 = new ArrayList<>();

        // add all students names ini your group
        group1.addAll(Arrays.asList("Rumi", "Cristina", "Adam", "Stani", "Rajmi", "Valentina"));
        System.out.println(group1);

        // verify your mentor and one of your closest friend's names are contains in the list
        boolean b =  group1.containsAll(Arrays.asList("Valentina", "Rumi", "Rajmi"));
        System.out.println(b);      // true

        System.out.println("=======================================");


        // removeAll(): --> removes the matching ones


        ArrayList<Integer> nums = new ArrayList<>();

        nums.addAll(Arrays.asList(1,1,2,3,3,3,4,4,5));
        nums.removeAll(Arrays.asList(1,4));
        System.out.println(nums);           // [2, 3, 3, 3, 5]


        System.out.println("=======================================");



        // retainAll() --> keep the matching ones



        ArrayList<Integer> num1 = new ArrayList<>();
        num1.addAll(Arrays.asList(1,1,2,3,3,3,4,4,5));

        System.out.println(num1);

        //  only keep the elements that either 1, or 2, 0r 3

        num1.retainAll(Arrays.asList(1,2,3));
        System.out.println(num1);               // [1, 1, 2, 3, 3, 3]




    }
}
