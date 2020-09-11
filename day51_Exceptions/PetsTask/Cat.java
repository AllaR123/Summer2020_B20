package day51_Exceptions.PetsTask;

public class Cat extends Pets {


    public Cat(String name, int age, char gender, String breed, String color) {
        super(name, age, gender, breed, color);
    }

    @Override
    protected void eat() {
        System.out.println(name + " is eating chocolate");

    }

    @Override
    protected void drink() {
        System.out.println(name + " is drinking milk");

    }

    @Override
    protected void sleep() {
        System.out.println(name + " is sleeping on the floor");

    }

    @Override                                // optinal to give
    public String toString() {

        return super.toString();
    }
}
