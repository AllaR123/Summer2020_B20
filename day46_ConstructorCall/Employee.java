package day46_ConstructorCall;

public class Employee {

    /*
    1. class Name: Employee
            instance variables:
                    name, jobTitle, ID, salary
            1st constructor: initialize the name of the employee
            2d constructor: initialize the name, jobTitle of the employee
                            (MUST apply constructor Call)
            3rd Constructor: initialize the name, jobTitle, ID of the employee
                            (MUST apply constructor Call)
            4th Constructor: initialize all the instance of the employee
                                (MUST apply constructor Call)
            Instance methods:
                toString()

     */

    String name;
    String jobTitle;
    int ID;
    double salary;


    public Employee(String name) {

        this.name = name;
    }

    public Employee(String name, String jobTitle) {

        this(name);         // sets the name
        this.jobTitle = jobTitle;
    }

    public Employee(String name, String jobTitle, int ID) {

        this(name, jobTitle);   // sets the name & jobTitle
        this.ID = ID;

    }

    public Employee(String name, String jobTitle, int ID, double salary) {

        this(name, jobTitle, ID);
        this.salary = salary;
    }

    public String toString(){
        return "Name: "+ name + "\nJob Title: "+ jobTitle+"\nID: "+ID + "\nSalary: $"+salary;
    }
}
