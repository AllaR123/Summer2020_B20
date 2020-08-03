package day34_Wrapper_Class;

import org.omg.PortableInterceptor.INACTIVE;

import java.util.ArrayList;
import java.util.List;

public class List_Practice {

    public static void main(String[] args) {

        List<Integer> oddList = new ArrayList<>();
        List<Integer> evenList = new ArrayList<>();

        for(int i = 0; i <= 100; i++) {
            if( i % 2 == 0) {
                evenList.add(i);
            } else {
                oddList.add(i);
            }
        }
//        for(Integer each : oddList) {
//            if(each % 2 == 0) {
//                evenList.add(each);
//            } else {
//                oddList.add(each);
//            }
//        }
//
//        for(Integer each : evenList) {
//            if(each % 2 == 0) {
//                evenList.add(each);
//            } else {
//                oddList.add(each);
//            }
//        }

        System.out.println(oddList);
        System.out.println(evenList);

        System.out.println("=================================");

        // print your list starting from last item

        List<String> groceryList = new ArrayList<>();
        groceryList.add("Avocado");
        groceryList.add("Milk");
        groceryList.add("Mango");
        groceryList.add("Apples");

        for(int i = groceryList.size()-1; i >= 0; i--) {
            System.out.println(groceryList.get(i) + ", ");
        }

        System.out.println("--------------------");
        for(String each : groceryList) {

            System.out.println(each);

        }

    }
}
