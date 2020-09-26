package day58_Polymorphism_Continue.AnimalTask;

public class Dog extends Animal {

    /*
    3. create subclass of Animal named Dog
            variable: dogName
            methods: bark, toString
     */

    public String dogName;

    public Dog(int age, char gender, String dogName) {
        super(age, gender);
        this.dogName = dogName;
    }

    public void bark() {
        System.out.println("Dog " + dogName +  " is barking");
    }

    @Override
    public void eat() {
        System.out.println("Dog " + dogName +  " is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Dog " + dogName +  " is sleeping");
    }

    @Override
    public String toString() {
        return "Dog{" +
                "dogName='" + dogName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
