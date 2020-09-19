package day56_Abstraction_Interface.AnimalTask;

public class Snake extends Animal implements Swimmable, Creeping {


    @Override
    public void eat() {
        System.out.println("Snake is eating");
    }

    @Override
    public void sleep() {
        System.out.println("Snake is sleeping");
    }

    @Override
    public void swim() {
        System.out.println("Snake is swimming");
    }

    @Override
    public void crawl() {
        System.out.println("Snake is creeping");
    }
}
