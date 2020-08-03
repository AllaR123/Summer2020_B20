package day25_Practices;

public class Shortest_String_For_each {

    public static void main(String[] args) {

        // Write a program that can return the shortest string of text from a String array

        String[] arr = {"Alla", "Denys", "Ruslana", "Andrey", "Abi"};
        int minLength = arr[0].length();

        for (String each : arr) { // to find out the min length of the string

            if (each.length() < minLength) {
                minLength = each.length();;
            }
        }

        // how many strings length are matching with int minLength = arr[0].length();
        for (String each : arr) {
            if(each.length() == minLength) {
                System.out.println(each);
            }
        }
    }
}
