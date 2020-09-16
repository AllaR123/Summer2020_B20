package day53_Final_Keyword.Employee;

import java.time.LocalDate;

public class PenFed {

    /*
    create a class called PenFed
            create 3 objects of Tester and Developers
            try to make change to the gender & DOfB of the employees
     */

    public static void main(String[] args) {

        Tester tester1 = new Tester("Alla", 'F', "05/01/1988", "SDET", 130000);
        Tester tester2 = new Tester("Denys", 'M', "08/13/1988", "QA", 120000);
        Tester tester3 = new Tester("Bogdan", 'M', "12/03/1990", "QA", 130000);
        System.out.println(tester1.toString());

        Developer developer1 = new Developer("Adam", 'M', "04/04/1994", "Dev",190_000);
        Developer developer2 = new Developer("Ruslana", 'F', "05/05/1987", "Dev",210_000);
        Developer developer3 = new Developer("Andrei", 'M', "04/19/1990", "Dev",180_000);
        System.out.println(developer2.toString());


       // Cannot change variable gender & DOfB ==> FINAL
        /*
        tester1.gender = 'F';
        tester2.gender = 'M';
        tester3.gender = 'F';
        tester1.DOfB = "01/01/2000";
        tester2.DOfB = "01/01/2000";
        tester3.DOfB = "01/01/2000";


        developer1.gender = 'M';
        developer2.gender = 'F';
        developer3.gender = 'M';
        developer1.DOfB = "01/01/2000";
        developer2.DOfB = "01/01/2000";
        developer3.DOfB = "01/01/2000";


         */
    }
}
