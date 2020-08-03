package day35_ArrayList;

import java.util.ArrayList;

public class ArrayList_Methods {

    public static void main(String[] args) {

        // set() --> replace

        ArrayList<String> students = new ArrayList<>();
                            students.add("Alla");
                            students.add("Denys");
                            students.add("Slava");
                            students.add("Ruslana");
                            students.add("Sasha");

                            students.set(2, "Andrey");  // set --> replace

        System.out.println(students);


        // clear() --> clear the list;

        students.clear();
        System.out.println(students);
        System.out.println("=========================");


        // remove(int index) --> removes the element at the given index

        ArrayList<Integer> list2 = new ArrayList<>();
        list2.add(1);
        list2.add(2);
        list2.add(3);
        list2.add(4);
        list2.add(5);

        list2.remove(2);

        System.out.println(list2);      // [1, 2, 4, 5]


        // remove(Element) --> removes the element

        ArrayList<Integer> list3 = new ArrayList<>();
        list3.add(1);
        list3.add(2);
        list3.add(3);
        list3.add(4);
        list3.add(5);


        Integer a = 1;      // wrapper class removes the ELEMENT!!!!!!
        list3.remove(a);

        System.out.println(list3);      // [2, 3, 4, 5]  will remove element

        ArrayList<String> list4 = new ArrayList<>();
        list4.add("Hamit");  //0
        list4.add("Liliia"); //1
        list4.add("Bulnet"); //2
        list4.add("Viorel"); //3
        list4.add("Musa");  //4

        //  list3.remove(2);
        list4.remove("bulnet");

        System.out.println(list4);      // [Hamit, Liliia, Bulnet, Viorel, Musa]
    }
}
