package day23_Array;

import java.util.Scanner;

public class Room_Reservation {
    public static void main(String[] args) {

        /*
        write a program for the room reservation:
            King Bed ==> 120$
            Queen Bed ==> 100$
            single Bed ==> 80$
            the program asks the user which bedroom does he/she wants to reserve and calculates the total price
            and then the program will ask:
                do you want to reserve another room:
                            if yes ==> repeat the previous steps
                            if no ==> your total price is: $$$
                            while answer is neither yes or no ==> please re-enter
            HINT: nested loop task, outter loop need to be an infinite loop
         */

        int price = 0;
        String room = "";
        String answer = "";

        Scanner scan = new Scanner(System.in);

        do {
            System.out.println("Which bedroom you'd like to reserve?");
            room = scan.nextLine();

            if(room.equalsIgnoreCase("King Bed")) {
                price += 120;
            } else if(room.equalsIgnoreCase("Queen Bed")) {
                price += 100;
            } else if(room.equalsIgnoreCase("Single Bed")) {
                price += 80;
            }
            System.out.println("You choose: " + room + " and price for this room is: $" + price);

            System.out.println("Would you like to reserve another one?");
            answer = scan.nextLine();

            while (!(answer.equalsIgnoreCase("yes")  || (answer.equalsIgnoreCase("no")))) {
                System.out.println("Your total price is: " + price);
                answer = scan.nextLine();
            };

        } while(answer.equalsIgnoreCase("yes"));
        System.out.println("You choose: " + room + "and price for this bedroom is: " + price);

    }
}
