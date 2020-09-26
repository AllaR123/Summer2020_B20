package day58_Polymorphism_Continue.AnimalTask;

public class Cat extends Animal {

    /*
    2. create subclass of Animal named Cat
            variable: catName
            methods: scratch, toString
     */

    public String catName;

    public Cat(int age, char gender, String catName) {
        super(age, gender);
        this.catName = catName;
    }

    public void scratch() {
        System.out.println("Cat " + catName +  " is scratching");
    }

    @Override
    public String toString() {
        return "Cat{" +
                "catName='" + catName + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                '}';
    }
}
