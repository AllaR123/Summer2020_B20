package day53_Final_Keyword.Employee;

public class Employee {

    /*
    1.create a class named Employee (meant to be super class):
            Attributes:
                    name, gender(final), DOfB(final), jobTitle, Salary
                    create constructor that can initialize all those attributes
                        (even final variable you should initialize them within constructor)
            Action:

    2. create a sub class of Employee named Tester(meant to be subClass ONLY)
    3. create a sub class of Employee named Developer(meant to be subClass ONLY)
    4. create a class called PenFed
            create 3 objects of Tester and Developers
            try to make change to the gender & DOfB of the employees

     */

    String name;
    final char gender;
    final String DOfB;
    String jobTitle;
    double salary;


    public Employee(String name, char gender, String DOfB,  String jobTitle, double salary) {
        this.name = name;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.gender = gender;
        this.DOfB = DOfB;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", gender=" + gender +
                ", DOfB='" + DOfB + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                '}';
    }
}
