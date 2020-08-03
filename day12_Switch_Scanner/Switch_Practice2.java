package day12_Switch_Scanner;

public class Switch_Practice2 {
    public static void main(String[] args) {


        // print Apple products using Switch

        String productName = "Ipad";

        switch (productName) {
            case "Galaxy" :
                System.out.println("Samsung");
                break;
            case "Iphone" : case "McBook" : case "Ipad" :
                System.out.println("Apple");
                break;
            case "T4534" :
                System.out.println("LG");
                break;

        }
    }
}
