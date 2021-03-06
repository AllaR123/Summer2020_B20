package day58_Polymorphism_Continue.AnimalTask;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;

public class Animal {

    /*
     1. cerate a class Animal
            variables: age, gender
            methods: eat, sleep, toString
        DO NOT make it abstract yet we need this for today's example
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch, toString
    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark, toString
     */

    public int age;
    public char gender;

    public Animal(int age, char gender) {
        this.age = age;
        this.gender = gender;
    }

    public void eat() {
        System.out.println("Animal is eating");
    }

    public void sleep() {
        System.out.println("Animal is sleeping");    }

    @Override
    public String toString() {
        return "Animal{" +
                "age=" + age +
                ", gender=" + gender +
                '}';
    }
}
