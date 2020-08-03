package day23_Array;

import java.util.Scanner;

public class Names_of_the_months {
    public static void main(String[] args) {

        String[] months = {"Jan", "Feb", "Mar", "Feb", "May", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter a numbers");

        int n = scan.nextInt();
            System.out.println(months[n-1]);
        }
    }
