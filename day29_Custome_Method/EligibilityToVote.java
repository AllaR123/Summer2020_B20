package day29_Custome_Method;

public class EligibilityToVote {

    /*
    age, citizenship, name
     */

    public static void vote(String name, int age, boolean citizenship) {

        boolean eligibleToVote = age >= 18 && citizenship == true;
        if(eligibleToVote) {
            System.out.println(name + " is eligible to vote");
        }
            System.out.println("Not eligible to vote");
            return;


    }

    // calculate 2 numbers

    public static void main(String[] args) {

        vote("Alla", 32, false);
        Calculator(50,20, '-');
    }


    public static void Calculator(int a, int b, char operator) {

        switch (operator) {
            case '+' :
                System.out.println("Addition: " + (a + b));
                break;
            case '-' :
                System.out.println("Subtraction: " + (a - b));
                break;
            case '/' :
                System.out.println("Devision: " + (a/b));
                break;
            case '*' :
                System.out.println("Multiplication: " + (a*b));
                break;
            case '%' :
                System.out.println("Remainder: " + (a%b));
                break;
            default:
                System.out.println("Invalid operator");
        }
    }
}
