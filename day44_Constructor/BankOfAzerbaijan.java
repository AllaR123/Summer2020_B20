package day44_Constructor;

import jdk.nashorn.internal.objects.NativeNumber;

import java.util.ArrayList;
import java.util.Arrays;

public class BankOfAzerbaijan {

    /*
    3. create class called BankOfAzerbaijan
        in the main method:
                1. create a List of Employees
                2. add random two employees from HumanResources to the List
                3. use for each loop to print out the employee info
     */

    public static void main(String[] args) {


        ArrayList<Employee> emp = new ArrayList<>();
        emp.addAll(Arrays.asList(HumanResources.employees[0]));
        emp.addAll(Arrays.asList(HumanResources.employees[3]));

        for(Employee each : emp) {
            System.out.println(each);

        }
    }
}
