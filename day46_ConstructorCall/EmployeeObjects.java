package day46_ConstructorCall;

import java.util.ArrayList;
import java.util.Arrays;

public class EmployeeObjects {

    public static void main(String[] args) {

        Employee emp1 = new Employee("Alla");
        System.out.println(emp1);
        System.out.println("=========================================");
        Employee emp2 = new Employee("Alla", "SDET");
        System.out.println(emp2);
        System.out.println("=========================================");
        Employee emp3 = new Employee("Alla", "SDET", 4567);
        System.out.println(emp3);
        System.out.println("=========================================");
        Employee emp4 = new Employee("Alla", "Dev", 12334, 130000);
        System.out.println(emp4);

        ArrayList<Integer> list1 = new ArrayList<>();

        ArrayList<Integer> list2  = new ArrayList<>(list1);

        ArrayList<Integer> list3  = new ArrayList<>(Arrays.asList(1,2,3,4,5));

        ArrayList<Integer> list4  = new ArrayList<>(list3);


    }
}
