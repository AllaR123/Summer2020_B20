package day25_Practices;

public class Shorter_String_NestedLoop {

    public static void main(String[] args) {

        // Write a program that can return the shortest string of text from a String array

        String[] arr = {"Alla", "Denys", "Ruslana", "Andrey", "Abi"};
        int minLength = arr[0].length();

            for (int i = 0; i <= arr.length - 1; i++) { // to find out the min length of the string
                int l = arr[i].length();           // 4  5  7  6  3
                if (l < minLength) {
                    minLength = l;
                }
            }

            // how many strings length are matching with int minLength = arr[0].length();
            for (int i = 0; i <= arr.length - 1; i++) {
            if(arr[i].length() == minLength) {
                System.out.println(arr[i]);
            }

        }
    }
}