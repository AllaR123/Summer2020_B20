package day29_Custome_Method;

public class Max_Min {

    public static void MaxMin(int[] arr) {

        int max = arr[0];
        int min = arr[0];

        for (int each : arr) {
            if (max < each) {
                max = each;
            }
        }

        for (int each : arr) {
            if (min > each) {
                min = each;
            }
        }

        System.out.println(max);
        System.out.println(min);
    }

    public static void main(String[] args) {

        int[] arr = {3, 4, 5, 7, 9, 100};
        MaxMin(arr);
    }

}