package day03_sequences_Variiables;

public class Variables {

    public static void main(String[] args) {


        double salary = 130000.0;
        double tax = 3.3;

        double totalTax = salary * tax;
        double salaryAfterTax = salary - tax;

        System.out.println("Total tax is: " + totalTax);
        System.out.println("Salary after tax: " + salaryAfterTax);
    }
}
