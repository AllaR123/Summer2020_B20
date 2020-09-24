package day57_Polymorphism.EmployeeTask;

import java.util.ArrayList;
import java.util.Arrays;

public class Apple {

    public static void main(String[] args) {

        Employee tester = new Tester("Alla", 343434, "QA", 13000, 'F');
        Employee developer = new Developer("Denys", 121212121, "Dev", 15000, 'M' );

        // scrumTeam

        ArrayList<Employee> scrumTeam = new ArrayList<>();
        scrumTeam.addAll(Arrays.asList(tester, developer));

        for(Employee each : scrumTeam) {
            System.out.println(each);
        }
    }
}
