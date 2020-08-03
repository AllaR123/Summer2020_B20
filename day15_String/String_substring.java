package day15_String;

public class String_substring {
    public static void main(String[] args) {

        // ending index is ALWAYS excluded

        String sentence = "Java is fun";
        //                 0123456789..
        String word1 = sentence.substring(0,4);
        System.out.println(word1);       // Java

        String word2 = sentence.substring(8);
        System.out.println(word2);


        System.out.println("===================================");

        String firstName = "RUDENKO";      // output --> Rudenko
        String str1 = firstName.substring(0,1);
        String str2 = firstName.substring(1).toLowerCase();
        System.out.println(str1 + str2);
    }
}
