package day58_Polymorphism_Continue;

import day58_Polymorphism_Continue.AnimalTask.Animal;
import day58_Polymorphism_Continue.AnimalTask.Cat;
import day58_Polymorphism_Continue.AnimalTask.Dog;

import java.util.ArrayList;
import java.util.Arrays;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog1 = new Dog(7, 'M', "Tyson");
        dog1.eat();
        dog1.sleep();
        dog1.bark();

        System.out.println(dog1.dogName);
        System.out.println(dog1.age);
        System.out.println(dog1.gender);
        System.out.println(dog1);

        System.out.println("======================================");

        Animal dog2 = new Dog(7, 'M', "Tyson");
        dog2.eat();
        dog2.sleep();
       // dog2.bark();    cannot call this method through Animal, parent decides what can be called

        System.out.println(dog2.age);
        System.out.println(dog2.gender);
        System.out.println(dog2);


        /*
        Animal cat1 = new Cat(12, 'F', "Alisa");
        Animal dog1 = new Dog(7, 'M', "Tyson");

        Animal cat2 = new Cat(3, 'M', "Cloud");
        Animal dog2 = new Dog(3, 'F', "Zephyr");

        Animal cat3 = new Cat(1, 'M', "Mafin");
        Animal dog3 = new Dog(1, 'F', "Bumer");

        ArrayList<Animal> zoo = new ArrayList<>();
        System.out.println(Arrays.asList(cat1, cat2, cat3, dog1, dog2, dog3));

        for(Animal each : zoo) {
            System.out.println(each);
        }

         */

    }
}
