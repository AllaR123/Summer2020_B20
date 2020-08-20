package day44_Constructor;

public class HumanResources {

    /*
    2. create a class called HumanResources
            declare 5 variables of Employee as static
            use static block to:
                        1. initialize those static variables
                        2. set all the info of the Employees
     */

    static Employee[] employees = {new Employee(), new Employee(),new Employee(),new Employee(),new Employee()};
    static {

        employees[0].setEmployeeInfo("Alla", 123, 454545, "SDET", 130000, 'F');
        employees[1].setEmployeeInfo("Denys", 321, 121212, "SDET", 135000, 'M');
        employees[2].setEmployeeInfo("Rumi", 456, 787878, "SM", 100000, 'F');
        employees[3].setEmployeeInfo("Stani", 654, 141414, "Team Lead", 110000, 'F');
        employees[4].setEmployeeInfo("Adam", 987, 474747, "Dev", 120000, 'M');

    }
}
