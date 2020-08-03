package day25_Practices;

public class FirstThreeChars_Array {
    public static void main(String[] args) {

        /*
        Write a program that will take five Strings and save them into an array called arr. and  Use for loop to print out the first three letter of each element of arr, one per line.
            You can assume that every element of arr is at least 3 letters long.
                Example: arr -> ["apple", "banana"]
                        prints:  appban
         */

        String[] words = {"Apple", "Banana", "Strawberry", "Pear", "Mellon"};
        for (String each : words) {
            System.out.print(each.substring(0,3));
        }
    }
}
