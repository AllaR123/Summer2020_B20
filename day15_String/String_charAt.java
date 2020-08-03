package day15_String;
import java.util.Scanner;

public class String_charAt {
    public static void main(String[] args) {


        /*
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter you first name");
        String firstName = scan.nextLine();
        System.out.println("Enter your last name");
        String lastName = scan.nextLine();
        System.out.println("What the initials of your Full name?");

        System.out.println(firstName.charAt(0) + ". " + lastName.charAt(0) + ". ");


         */

        /*
        You have a word, do the following:

        1. When word has odd number of characters and:
            - 3 or more characters, print middle letter
                oak ==> a
                 javav ==> v
             - Single character, print that character 3 times
                      # ==> ###
                      q ==> qqq

        2. When word has even number of characters and:
           - 4 or more characters, print middle 2
                  java ==> av
                  apples ==> pl
                  #$%^&* ==> %^
           - 2 characters, print those 2 characters twice
                      @@ ==>@@@@
                     $$ ==>$$$$
                      hi ==> hihi
         */
        Scanner scan = new Scanner(System.in);
        String word = scan.next();

        if(word.length()%2 == 0 && word.length() >= 4) {
            System.out.println((word.charAt(word.length()/2-1) + "" + word.charAt(word.length()/2)));
        } else if(word.length() == 2) {
            System.out.println(word+word);
        } else if(word.length()%2 != 0 && word.length() >= 3) {
            System.out.println(word.charAt(word.length()/2));
        } else if(word.length() == 1) {
            System.out.println(word + word + word);
        }

        /*
        if ( word.length()%2 !=0 && word.length()>= 3)   {
	         System.out.println (word.substring(word.length()/2, word.length()/2+1));
	     }
	         else if( word.length() ==1) {
	             System.out.println(word +  word + word);
	         }

	         else if (word.length()%2 ==0 && word.length()>= 4) {
	             System.out.println(word.substring(word.length()/2 -1, word.length()/2+1));
	         }
	         else if
	         ( word.length() ==2) {
	             System.out.println(word + word);
         */

    }
}
