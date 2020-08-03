package day08_if_Statement;

public class Practice {

    public static void main(String[] args) {

        String firstName = "Aaron";
        String lastName = "Daniel";
        int age = 19;
        String citizenShip = "USA";

        String fullName = firstName + " " + lastName;
        boolean eligibility = age >= 19 && citizenShip == "USA";
        System.out.println(fullName + " is eligible to vote: " + eligibility);

    }
}
