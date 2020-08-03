package day26_Multi_Dimen_Arrays;

import java.util.Arrays;

public class Java_Python {
    public static void main(String[] args) {


        String sentence = "Java Java Python Python";

        String[] words = sentence.split(" ");

        System.out.println(Arrays.toString(words));
        int countJava = 0;
        int countPython = 0;

        for(String each  : words){
            if(each.toLowerCase().contains("java")){
                countJava++;
            }else if(each.toLowerCase().contains("python")){
                countPython++;
            }

        }

        System.out.println("Java: "+countJava);
        System.out.println("Python: "+countPython);

        System.out.println( countJava == countPython);

        /*
        str = JavaScript
        str.equals(Java) ==>false
        str.contains("Java") ==> true
         */

    }

}
