package day51_Exceptions.PetsTask;

public class Pets {

    String name;
    int age;
    char gender;
    String breed;
    String  color;

    public Pets(String name, int age, char gender, String breed, String color) {
        this.name = name;
        this.age = age;
        this.gender = gender;
        this.breed = breed;
        this.color = color;
    }

    protected void eat() {
        System.out.println(name + " is eating chocolate");

    }

    protected void drink() {
        System.out.println(name + " is drinking milk");

    }

    protected void sleep() {
        System.out.println(name + " is sleeping on the floor");

    }

    public String toString() {

        return name + " " + age + " " + gender + " " + breed + " " + color;

    }
}
