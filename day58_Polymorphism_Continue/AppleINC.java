package day58_Polymorphism_Continue;

import day57_Polymorphism.EmployeeTask.*;

import java.util.ArrayList;
import java.util.Arrays;

public class AppleINC {

    public static void main(String[] args) {


        Employee[] workers = {
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Tester("Musa Moylam", 123456, "SDET", 130000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M'),
                new Developer("Abdul", 123456789, "QA", 110000, 'M')
        };

        ArrayList<Employee> scrumTeam = new ArrayList<>(Arrays.asList(workers));

        int countTester = 0;
        int countDeveloper = 0;
        int countScrumTeam = 0;

        for (Employee each : scrumTeam) {
            if(each instanceof Tester) {
                countTester++;
            } else if(each instanceof Developer) {
                countDeveloper++;
            } else {
                countScrumTeam++;
            }

        }

        System.out.println("Testers: " + countTester);
        System.out.println("Developers: " + countDeveloper);
        System.out.println("Scrum team: " + countScrumTeam);


    }
}