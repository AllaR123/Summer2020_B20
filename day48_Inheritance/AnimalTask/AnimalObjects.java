package day48_Inheritance.AnimalTask;

public class AnimalObjects {


    public static void main(String[] args) {


        Dog dog1 = new Dog("Winston", "Medium", 5, "Shepper", "Black");
        System.out.println(dog1.name);
        System.out.println(dog1.size);
        System.out.println(dog1.age);

        dog1.sleep();
        dog1.eat();
        dog1.bark();

        System.out.println("======================================");

        System.out.println(dog1);

        Cat cat1 = new Cat("Alisa", "small", 12, "Siamskii", "White");
        System.out.println(cat1);


    }
}