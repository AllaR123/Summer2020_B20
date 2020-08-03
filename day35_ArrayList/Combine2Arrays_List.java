package day35_ArrayList;

import com.sun.org.apache.xml.internal.security.Init;

import java.util.ArrayList;
import java.util.List;

public class Combine2Arrays_List {

    /*
    write a program that can combine two String arrays into one arrayList
            ex:
                arr1 = {"A", "B", "C"};
                arr2 = {"D", "E", "F", "G"};
                list ==> {"A", "B", "C", "D", "E", "F", "G"}
     */

    public static void main(String[] args) {

        String[] group1 = {"Alla", "Bob", "Chris"};
        String[] group2 = {"Denys", "Ernis", "Franco", "George"};

        List<String> list = new ArrayList<>();

        for (String each : group1) {
            list.add(each);
        }

        for (String each : group2) {
            list.add(each);
        }

        System.out.println(list);


    }
}