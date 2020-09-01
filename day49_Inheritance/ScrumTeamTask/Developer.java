package day49_Inheritance.ScrumTeamTask;

public class Developer extends Employee {

    /*
     create a subclass of Employee called called Developer
                    Attributes:
                        ame, age, gender, Salary, ID, jobTitle
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
     */

    /*
        String name;
        int age;
        char gender;
        double salary;
        int ID;
        String jobTitle;
     */

    public Developer(String name, int age, char gender, double salary, int ID, String jobTitle) {

        setEmployeeInfo(name, age, gender, salary, ID, jobTitle);

    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void fixBug() {
        System.out.println(name + " is fixing bugs");
    }

}
