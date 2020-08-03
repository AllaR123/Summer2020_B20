package day29_Custome_Method;

public class Unique {
    public static void main(String[] args) {

        String[] arr = {"A","B","B","C"};


        for(String  a : arr) {      // get each of the element
            int count = 0;

            for(String each : arr) {        // gets the frequency of the element
                if(a.equalsIgnoreCase(each)) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.println(a);
            }

        }


    }
}
