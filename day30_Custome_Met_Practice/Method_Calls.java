package day30_Custome_Met_Practice;

import Library.Util;

public class Method_Calls {
    public static void main(String[] args) {

        String str = "aaaabbbbccccdddd";
        String str2 = Util.removeDup(str);
        System.out.println(str2);

        String s = "rudenko";
        String str3 = Util.reverseString(s);
        System.out.println(str3);

        int[] arr = {2,4,6,8};
        int r = Util.maxNum(arr);
        System.out.println(r);


    }
}