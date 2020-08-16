package day42_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class Testers {

    /*
    create a class called Testers
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), smokeTesting(),  creatingTicket(), toString()
        create a class called Developer
                    Attributes:
                        name, employeeID, JobTitle, Salary
                    Actions:
                        setInfo(), coding(),  fixBug(), toString()
        create a class called ScrumTeam
                    Attributes:
                            PO, BA, SM,
                            ArrayList<Tester> testers = new ArrayList<>(),
                            ArrayList<Developer> testers = new ArrayList<>(),
                    Actions:
                            setInfo(): sets the names of: PO, BA, SM
                            addTester(Tester tester): adds the given tester to the testers arraylist
                            addTesters(Tester[] testers): adds the given testers to the testers arraylist
                            addDeveloper(Developer developer): adds the given developer to the developers arraylist
                            addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
                            removeTester(long employeeID): removes the given tester from the testers arraylist
                            removeDeveloper(long employeeID): removes the developer from the developers arraylist
     */

    String name;
    int employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, int employeeID, String jobTitle, double salary) {

        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;


    }

    public void smokeTesting(String smoke) {

        System.out.println(name + " is doing " + smoke + "testing");

    }

    public void creatingTicket(String ticket) {

        System.out.println(name + " is creating a " + ticket);
    }

    public String toString() {

        return name + " " + employeeID + " " + jobTitle + " " + salary;

    }
}

class Developers {

    String name;
    int employeeID;
    String jobTitle;
    double salary;

    public void setInfo(String name, int employeeID, String jobTitle, double salary) {

        this.name = name;
        this.employeeID = employeeID;
        this.jobTitle = jobTitle;
        this.salary = salary;

    }

    public void coding(String cod) {
        System.out.println(name + " is coding " + cod);
    }

    public void fixBud(String bug) {

        System.out.println(name + " is fixing " + bug);
    }

    public String toString() {

        return name + " " + employeeID + " " + jobTitle + " " + salary;
    }
}


class ScrumTeam {

    String PO;
    String BA;
    String SM;


    ArrayList<Testers> testers = new ArrayList<>();
    ArrayList<Developers> developers = new ArrayList<>();


    public void setInfo(String PO, String BA, String SM) {
        this.PO = PO;
        this.BA = BA;
        this.SM = SM;

    }

    // addTester(Tester tester): adds the given tester to the testers arraylist
    public void addTester(Testers tester) {

       testers.add(tester);
    }

    // addTesters(Tester[] testers): adds the given testers to the testers arraylist
    public void addTesters(Testers[] testers) {

        this.testers.addAll(Arrays.asList(testers)); // same instance and local variable, that's why .this
    }

    // removeTester(long employeeID): removes the given tester from the testers arraylist
    public void removeTester(long employeeID) {
        testers.removeIf(p -> p.employeeID == employeeID);     // removing from the  tester's arrayList
    }

    // addDeveloper(Developer developer): adds the given developer to the developers arraylist
    public void addDeveloper(Developers developer) {

        developers.add(developer);

    }

    // addDevelopers(Developer[] developers): adds the given developers to the developers arraylist
    public void addDevelopers(Developers[] developers) {
        this.developers.addAll(Arrays.asList(developers));
    }

    // removeDeveloper(long employeeID): removes the developer from the developers arraylist
    public void removeDeveloper(long employeeID) {

        developers.removeIf(p -> p.employeeID == employeeID);       // removing from the developer's arrayList
    }

    public String toString() {
        return testers.size() + " testers, " + developers.size() + " developers, PO: " + PO + " , BA: " + BA + " , SM: " + SM;
    }
}


    /*
    create a class called MyScrumTeam:
                    1. create an array of Testers and store the testers info in your group
                    2. create an array of developers store the developers info in your group
                    3. create an object of ScrumTeam and store the testers & developers above to the scrum team
                    Answer the interview question "Tell me about your scrum team"
     */

    class MyScrumTeam {

        public static void main(String[] args) {

            Testers[] testers = {new Testers(), new Testers(), new Testers()};
            testers[0].setInfo("Alla", 19880501, "SDET", 130000);
            testers[1].setInfo("Denys", 15480501, "SDET", 135000);


            Developers[] developers = {new Developers(), new Developers(), new Developers()};
            developers[0].setInfo("Adam", 345678200, "Dev", 140000);
            developers[1].setInfo("Rumi", 144578200, "Dev", 145000);
            developers[2].setInfo("Stani", 225678200, "Dev", 150000);

            ScrumTeam team = new ScrumTeam();
            team.setInfo("Anna", "Olya", "Katya");
            team.addTesters(testers);
            team.addDevelopers(developers);
            System.out.println(team);

            System.out.println("==========================================");

            for (Testers each : team.testers) {
                System.out.println(each.name +  " " + each.salary);

            }

            System.out.println("------------------------------------------");

            for(Developers each : team.developers) {
                System.out.println(each.name + " " + each.salary);
            }

            System.out.println("==========================================");
            team.removeTester(15480501);
            team.removeDeveloper(345678200);
            System.out.println(team);

            System.out.println("******************************************");
            Developers dev = new Developers();
            dev.setInfo("Cristina", 34343545, "Dev", 135000);
            team.addDeveloper(dev);
            System.out.println(team);



            System.out.println("-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*");


            /*
            print all developers and testers from scrum team
            find the max salary from test team and max salary from dev team
            print out that names
             */

            // creating new scrumTeam
            ScrumTeam[] newScrum = {team, new ScrumTeam(), new ScrumTeam()};

            team.addTesters(testers);
            team.addDevelopers(developers);
            System.out.println(team);


        }


    }
