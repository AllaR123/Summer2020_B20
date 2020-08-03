package day25_Practices;

public class Count_Odd_Even_Array {
    public static void main(String[] args) {


        // Write a program that can count the even and odd number from an array of integers
        int[] nums = {1,2,3,4,5,6,7,8,9,10,11};

        int countEven = 0;
        int countOdd = 0;

        for (int each: nums) {
            if(each % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
        }

        System.out.println("Count of even numbers " + countEven);
        System.out.println("Count of odd numbers: " + countOdd);
    }
}
