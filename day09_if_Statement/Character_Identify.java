package day09_if_Statement;

public class Character_Identify {

    public static void main(String[] args) {

        /*
        write a program that can identify if the given character is Alphabetic
            ex:
                character = 'a'
            output:
                a is an Alphabetic
                character  = '!'
            output:
                ! is not  anAlphabetic
        Hint:
                ascii table:
                        65 ~ 90 ==> A~Z
                        97 ~ 122 ==> a~z
         */

        char character = 'A';
        boolean isAlphabetic = (character >= 65 && character <= 90) || (character >= 97 && character <= 122);

        if(isAlphabetic) {
            System.out.println(character + " is alphabetic character");
        } else {
            System.out.println(character + " ia not alphabetic character");
        }

        /*
        write a program that can identify if the given character is Digit
                ex:
                    character = '1'
                output:
                    1 is a Digit
                    character  = '!'
                output:
                    ! is not a digit
         */

        System.out.println("================================");

        char character1 = '1';
        boolean isACharacter = (character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122);
        boolean isADigit = character1 >= 48 && character1 <= 57;

        if (isACharacter) {
            System.out.println(character1 + " is a character");
        }
        else if (isADigit) {
            System.out.println(character1 + " is a digit");
        }
        else {
            System.out.println(character1 + " is a Symbol");
        }

        /*
        write a program that can identify if the given character is a symbol
                ex:
                    character = '!'
                output:
                    ! is a symbol
                    character  = 'a'
                output:
                    a is not a symbol
         */

        System.out.println("---------------------------------");

        char symbol = '!';
        boolean isAsymbol = character1 >= 48 && character1 <= 57;
        boolean isAcharacter = (character1 >= 65 && character1 <= 90) || (character1 >= 97 && character1 <= 122);

        if(isAsymbol) {
            System.out.println(symbol + " is a symbol");
        } else if(isACharacter) {
            System.out.println(symbol + " is a character");
        } else {
            System.out.println(symbol + " is a digit");
        }
    }
}
