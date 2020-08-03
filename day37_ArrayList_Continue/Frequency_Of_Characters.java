package day37_ArrayList_Continue;

import Library.Util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Frequency_Of_Characters {

    /*
    write a program that can find the frequency of character from a String
                        DO NOT use nested loop
                        "AABBCCDDEE"  ==> "ABCDE"
                        output: A2B2C2D2E2
     */

    public static void main(String[] args) {

        String str = "AAABC";

        ArrayList<String> list = new ArrayList<>();

        list.addAll(Arrays.asList(str.split("")));

        // OR we can use this loop here
        /*
        for(String each : str.split("")) {
            list.add(each);
        }

         */


        String nonDup = Util.removeDup(str);

        for(String each : nonDup.split("")) {       // [A,B,C]

            int count = Collections.frequency(list, each);
            System.out.print(each + count);                     // A3B1C1
        }

    }
}
