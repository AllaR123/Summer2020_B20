package day51_Exceptions.PetsTask;

public class AnimalObject {

    public static void main(String[] args) {

        Dog dog = new Dog("Bumer", 12, 'M', "Lab", "white");
        Cat cat = new Cat("Alisa", 6, 'F', "Persian", "grey");


        System.out.println(dog);
        dog.eat();
        dog.drink();
        dog.sleep();


        System.out.println("------------------------------------------------");


        System.out.println(cat);
        cat.eat();
        cat.drink();
        cat.sleep();



    }
}
