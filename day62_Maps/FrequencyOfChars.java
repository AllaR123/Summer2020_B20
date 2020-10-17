package day62_Maps;
import java.util.*;

public class FrequencyOfChars {

        /*
        FrequencyOfChars
        1. Write a program that stores the the character and frequency of each character from a String in to a Map

        Ex:
            str = "aaabbbccb"
            output:
                {a=3, b=4, c=2}

         */

    public static void main(String[] args) {


        String str = "aaabbbccb";   //a3b4c2
        Map<String, Integer> map = new LinkedHashMap<>();      // {a=3, b=4, c=2}

        List<String> list = Arrays.asList(str.split(""));

        for(String each : list) {
           // int frequency = Collections.frequency(list, each);
            map.put(each, Collections.frequency(list, each));
            // each --> each character from the  List

        }
        System.out.println(map);        // {a=3, b=4, c=2}

    }

}
