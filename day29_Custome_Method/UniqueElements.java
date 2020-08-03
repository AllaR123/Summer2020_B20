package day29_Custome_Method;

public class UniqueElements {

    public static void main(String[] args) {

        String[] words = {"boy", "girl", "boy",  "mom", "dad", "dad"};
        uniques(words);
        System.out.println();
    }

    public static void uniques(String[] arr) {

        for(String  a : arr) {      // get each of the element

            int count = 0;
            for(String each : arr) {        // gets the frequency of the element
                if(a.equalsIgnoreCase(each)) {
                    count++;
                }
            }

            if(count == 1) {
                System.out.print(a + " ");      // girl mom
            }

        }


    }
}
