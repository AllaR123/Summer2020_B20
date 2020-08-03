package day31_Recap;

public class Methods_Practice {

    public static void main(String[] args) {

        int c = max(20,10);
        System.out.println(c * 2);  // can reuse it bc of return type

    }

    public static int max(int a, int b) {

        int max = (a > b) ? a : b;
        return max;
    }
}
