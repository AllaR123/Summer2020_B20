package day30_Custome_Met_Practice;

public class ReturnMethods {

    public static void main(String[] args) {

        addition1(5,8);
        int sum = addition2(1,2);
        System.out.println(sum);

    }

    public static void addition1(int a, int b) {

        int sum = a + b;
        System.out.println(sum);
    }

    public static int addition2(int c, int d) {

        int sum = c + d;
        return sum;
    }

}
