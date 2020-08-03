package day32_Method_Overlodaing;
import Library.Util;

import java.util.Arrays;

public class MethodCalls {

    public static void main(String[] args) {

        String firstName = "elKEM ";
        String lastName = "emEt";

        String fullName = Util.fullName(firstName, lastName);
        System.out.println(fullName);

        String uniques = Util.uniques(fullName.toLowerCase());
        System.out.println(uniques);

        String reversNAme = Util.reverseString(fullName);
        System.out.println(reversNAme);


        System.out.println("==========================================");

        int[] arr = {1,5,44,800,12};
        int n = 39;
        arr = Util.addElement(arr, n);
        System.out.println(Arrays.toString(arr));    // [1, 5, 44, 800, 12, 39]


    }
}