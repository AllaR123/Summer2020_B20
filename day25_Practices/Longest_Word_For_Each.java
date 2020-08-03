package day25_Practices;

public class Longest_Word_For_Each {
    public static void main(String[] args) {

        // Write a program that can return the longest string of text from a String array

        String[] arr = {"Alla", "Denys", "Ruslana", "Andrey", "Abi"};
        int maxLength = arr[0].length();

        for (String each : arr) { // to find out the max length of the string

            if (each.length() > maxLength) {
                maxLength = each.length();;
            }
        }

        // how many strings length are matching with int maxLength = arr[0].length();
        for (String each : arr) {
            if(each.length() == maxLength) {
                System.out.println(each);
            }
        }
    }
}
