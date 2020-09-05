package day51_Exceptions;

import java.util.ArrayList;

public class ExceptionHandling {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();        // list is empty

        try {
            System.out.println(list.get(1));

        } catch(IndexOutOfBoundsException e) {
            System.out.println(e.getMessage());     // return us String
                                                    // Index: 1, Size: 0

        }

        System.out.println("Next step");
    }
}
