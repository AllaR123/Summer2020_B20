package day48_Inheritance.AnimalTask;

public class Animal {


    public String name;
    public String size;
    public int age;
    public String breed;
    public String  color;


    public void setInfo(String name, String size, int age, String breed, String color) {

        this.name = name;
        this.size = size;
        this.age = age;
        this.breed = breed;
        this.color = color;
    }

    public void eat() {
        System.out.println(name + " is eating");
    }

    public void sleep() {
        System.out.println(name + " is sleeping");
    }

    public String toString() {


        return name + " " + size + " " + age + " " + breed + " " + color;
    }

}
