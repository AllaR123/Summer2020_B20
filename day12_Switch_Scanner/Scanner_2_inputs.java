package day12_Switch_Scanner;

import java.util.Scanner;

public class Scanner_2_inputs {

    public static void main(String[] args) {

        // Sum of 2 numbers

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter first number: ");
        int a = scanner.nextInt();
        System.out.println("Enter second number: ");
        int b = scanner.nextInt();
        System.out.println("Sum of this 2 numbers are: " + (a + b));



        // Calculate salary (Rate Calculator)
        System.out.println("+++++++++++++++++++++++++++++++++++++++");
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your annual salary: ");
        double salary = scan.nextDouble();

        System.out.println("How many hours do you work in a week? ");
        int hours = scan.nextInt();

        int totalHours = hours * 52;
        double hourlyRate = salary / totalHours;
        System.out.println("Your hourly rate is $: " + hourlyRate);


    }
}
