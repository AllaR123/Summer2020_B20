package day62_Maps;
import java.util.*;

public class UniqueCharFromString {

    /*
    2. write a program that stores the unique characters from a string into a map

        Ex:
            str = "abacbdeefacacabbjbca";
            output:
                {c=1, d=1, f=1}
     */

    public static void main(String[] args) {


        String str = "abacbdeefacacabbjbca";

        Map<String, Integer> map = new LinkedHashMap<>();      //  {c=1, d=1, f=1}
        List<String> list = Arrays.asList(str.split(""));

        for(String each : list) {           // frequency --> key, each --> value

            if(Collections.frequency(list, each) == 1) {
                map.put(each, 1);
            }

        }
        System.out.println(map);        // {c=1, d=1, f=1}

        // verify that 'j' is unique
        System.out.println(map.containsKey("j"));

    }
}
