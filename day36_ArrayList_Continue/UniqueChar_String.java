package day36_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Collections;

public class UniqueChar_String {

    // Find unique characters from the String (do not use nested loop) --> "AABBCCD" --> A2B2C2D1

    public static void main(String[] args) {

        String str = "AABBCDDEE";         // C
        String  unique = "";

        ArrayList<String> list = new ArrayList<>();

        for(String each : str.split("")) {
            list.add(each);
        }

        System.out.println(list);

        for(String each : list) {
            int count = Collections.frequency(list, each);
            if(count == 1) {
                System.out.println(each);       // C
            }
        }

        System.out.println(unique);

    }
}
