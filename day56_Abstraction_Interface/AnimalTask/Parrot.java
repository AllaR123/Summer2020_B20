package day56_Abstraction_Interface.AnimalTask;

public class Parrot extends Animal implements Flyable, Playable, Talkative {


    @Override
    public void eat() {
        System.out.println("Parrot is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Parrot is sleep");

    }

    @Override
    public void fly() {
        System.out.println("Parrot is fly");

    }

    @Override
    public void play() {
        System.out.println("Parrot is play");

    }

    @Override
    public void talk() {
        System.out.println("Parrot is talking");
    }
}
