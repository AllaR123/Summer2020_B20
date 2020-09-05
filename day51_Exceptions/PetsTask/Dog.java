package day51_Exceptions.PetsTask;

public class Dog extends Pets {


    public Dog(String name, int age, char gender, String breed, String color) {
        super(name, age, gender, breed, color);
    }

    @Override
    protected void eat() {
        System.out.println(name + " is eating chicken");

    }

    @Override
    protected void drink() {
        System.out.println(name + " is drinking water");

    }

    @Override
    protected void sleep() {
        System.out.println(name + " is sleeping on the bed");

    }

    @Override
    public String toString() {
        return super.toString();
    }


}
