package day05_Arithnetical_Operators;

public class Salary_Calculater {

    public static void main(String[] args) {

        /*
        task04:
           Write a program that can calculate the tax,
            and salary after tax based on the hourly rate & tax rates
            then output will be:
                            your salary is: 96000.0 USD
                            your total tax is: 23040.0 USD
                            your income after tax is: 7296.0 USD
                Assume that a year has 48 weeks (excluding PTO)

                salary = rate * weeklyHours * 48;
         */

        double rate = 50.0;
        double stateTaxRate = 0.04;
        double federalTaxRate = 0.2;
        int weeklyHours = 40;


        double salary = rate * weeklyHours * 48;
        double totalTax = salary * (stateTaxRate + federalTaxRate);
        double incomeAfterTax = salary - totalTax;

        System.out.println(salary +  " " + totalTax +  " " + incomeAfterTax);

    }
}
