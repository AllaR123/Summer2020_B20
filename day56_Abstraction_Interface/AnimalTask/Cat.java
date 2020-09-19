package day56_Abstraction_Interface.AnimalTask;

public class Cat extends Animal implements Playable, Swimmable {


    @Override
    public void eat() {
        System.out.println("Cat is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Cat is sleeping");
    }

    @Override
    public void play() {
        System.out.println("Cat is playing");
    }

    @Override
    public void swim() {
        System.out.println("Cat is swimming");
    }


}
