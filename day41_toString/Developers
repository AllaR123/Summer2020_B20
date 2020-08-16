package day41_toString;

public class Developers {

    String name;
    double salary;
    String gender;
    int age;

    public void setInfo(String name, double salary, String gender, int age) {
        this.name = name;
        this.salary = salary;
        this.gender = gender;
        this.age = age;

    }

    public void coding() {
        System.out.println(name + " is coding");
    }

    public void fixBugs() {
        System.out.println(name + " is crying");
    }

    public String toString() {


        return name + " " + salary + " " + gender + " " + age;
    }
}

class DeveloperObject {

    public static void main(String[] args) {

        Developers[] devs = {new Developers(), new Developers(), new Developers()};

        devs[0].setInfo("Alla", 130000, "Female", 32);
        devs[1].setInfo("Denys", 150000, "Male", 32);
        devs[2].setInfo("Rumi", 120000, "Female", 28);


        for(Developers each : devs) {
            //each.coding();
            //each.fixBugs();
           System.out.println(each);
        }


    }

}


