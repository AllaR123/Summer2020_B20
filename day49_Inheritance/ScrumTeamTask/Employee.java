package day49_Inheritance.ScrumTeamTask;

public class Employee extends Person {

    /*
     create a subclass of Person called Employee
                attributes: name, age, gender, Salary, ID, jobTitle
                methods: work, setEmployeeInfo
     */

    /*
        String name;
        int age;
        char gender;
     */
    double salary;
    int ID;
    String jobTitle;


    public void work() {
        System.out.println(name + " is working");

    }
    public void setEmployeeInfo(String name, int age, char gender, double salary, int ID, String jobTitle) {

        setInfo(name, age, gender);
        this.salary = salary;
        this.ID = ID;
        this.jobTitle = jobTitle;
    }

    public String toString() {

        return name + " " + age + " " + gender + " " + salary + " " + ID + " " + jobTitle;
    }

}
