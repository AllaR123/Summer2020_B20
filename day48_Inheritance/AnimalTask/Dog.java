package day48_Inheritance.AnimalTask;

public class Dog extends Animal {

    public void bark() {

        System.out.println(name + " is barking");

        /*
        variables: 2
        methods: 3

         */

    }

    public Dog(String name, String size, int age, String breed, String color) {
        setInfo(name, size, age, breed, color);

    }
}
