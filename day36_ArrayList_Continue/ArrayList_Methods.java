package day36_ArrayList_Continue;

import java.util.ArrayList;

public class ArrayList_Methods {

    /*
     indexOf()
     lastIndexOf()
     contains()
     equals ()
     isEmpty()
  */

        public static void main(String[] args) {


            // indexOf()
            // lastIndexOf()
            // contains()


            ArrayList<Integer> list = new ArrayList<>();
            list.add(10); //0
            list.add(20); //1
            list.add(30); //2
            list.add(40); //3
            list.add(50); //4
            list.add(40); // 5

            int a = list.indexOf(40);

            System.out.println(a);          // 3

            System.out.println( list.indexOf(60)); // 60 is not exist in the list       // -1

            System.out.println(list.lastIndexOf(40));

            boolean r1 = list.contains(100);

            System.out.println(r1);         //5


            System.out.println("==============================================");


            // equals ()

            ArrayList<String> list1 = new ArrayList<>();
            list1.add("Cybertek");

            ArrayList<String> list2 = new ArrayList<>();
            list2.add("Cybertek");

            System.out.println(list1);
            System.out.println(list2);

            System.out.println(list1.equals(list2));        // true


            // isEmpty()

            ArrayList<String> list3 = new ArrayList<>();
            System.out.println(list3.isEmpty());            // true

        }


    }
