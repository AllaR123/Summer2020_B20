package day12_Switch_Scanner;

public class Switch_Statement {

    public static void main(String[] args) {

        int a = 1;
        switch (a) {
            default:
                System.out.println("NO cases what are matching");

            case 5:
                System.out.println("Five");
                break;

            case 1:
                System.out.println("one");

        }

        /*
        Print days of the week using switch statement
         */

        int b = 7;

        switch (b) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid case");

        }
    }
}