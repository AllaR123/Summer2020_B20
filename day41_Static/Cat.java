package day41_Static;

public class Cat {

    /*
    Task:
    Cat:
        attributes:
                name, age, gender, breed
        Actions:
                setInfo, eat, drink, toString
                use this. keyword
    Make sure that you can print out the objects of the Cat in the print statement

     */

    String name;
    int age;
    char gender;
    String bread;


    public void seInfo(String name,  int age, char gender, String bread) {

        this.name = name;
        this.age = age;
        this.gender = gender;
        this.bread = bread;


    }

    public void eat(String catFood) {

        System.out.println(name + " is eating " + catFood);
    }

    public  void drink(String catDrink) {

        System.out.println(name + " is drinking " + catDrink);
    }

    public String toString() {

        return name + " " + age + " " + gender + " " + bread;
    }

}
