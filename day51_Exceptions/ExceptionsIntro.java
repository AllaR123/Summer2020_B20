package day51_Exceptions;

public class ExceptionsIntro {

    public static void main(String[] args) throws InterruptedException {

        int[] arr = {1,2,3};
        System.out.println(arr[100]);       // unchecked exception

        Thread.sleep(2000);            // checked exceptions


        String str = "Cybertek";
        System.out.println(str.charAt(-1));      // unchecked exception
    }
}
