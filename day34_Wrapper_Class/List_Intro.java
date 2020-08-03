package day34_Wrapper_Class;

import java.util.ArrayList;
import java.util.List;

public class List_Intro {

    public static void main(String[] args) {


        // add();

        List<Integer> list = new ArrayList<>();
        list.add(4);
        list.add(45);
        list.add(85);
        list.add(8);

        list.add(2,3);

        System.out.println(list);       // [4, 45, 3, 85, 8]


        // get();

        System.out.println(list.get(2));        // 3

    }
}
