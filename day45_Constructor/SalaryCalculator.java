package day45_Constructor;

public class SalaryCalculator {

    /*
    Create class called SalaryCalculator
                instance variables:
                    hourlyRate, weeklyHours, stateTaxRate, federalTaxRate
                add a constructor can initialize those fields
                instance methods:
                    salary(): returns the total salary as double  (hourlyRate * weeklyHours * 48)
                    stateTax(): retuns the total state tax as double ( salary * stateTaxRate)
                    federalTax(): retuns the total federal tax as double ( salary * fedralTaxRate)
                    salaryAftertax(): retuns the salary after tax as double ( salary - stateTax - federalTax)
                    toString(): returns the hourlyRate, weeklyHours and salary info as calculated by salary()
     */

    double hourlyRate;
    int weeklyHours;
    double  stateTaxRate;
    double federalTaxRate;


    public SalaryCalculator(double hourlyRate, int weeklyHours, double stateTaxRate, double federalTaxRate) {
        this.hourlyRate = hourlyRate;
        this.weeklyHours = weeklyHours;
        this.stateTaxRate = stateTaxRate;
        this.federalTaxRate = federalTaxRate;
    }


    public double salary() {
        return (hourlyRate * weeklyHours) * 48;
    }

    public double stateTax() {

        return  salary() * stateTaxRate;
    }

    public double federalTax() {
        return salary() * federalTaxRate;
    }

    public double salaryAfterTax() {

        return salary() - stateTax() - federalTax();
    }

    public String toString() {
        return "Salary: " + salary() + "State tax: " + stateTaxRate + "Federal Tax: " + federalTaxRate;

    }
}
