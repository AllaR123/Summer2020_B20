package day48_Inheritance.AnimalTask;

public class Cat extends Animal {

    public Cat(String name, String size, int age, String breed, String color) {

        setInfo(name, size, age, breed, color);
    }

    public void meow() {
        System.out.println(name + " meowing");
    }
}
