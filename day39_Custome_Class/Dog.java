package day39_Custome_Class;

public class Dog {

    String name;
    String breed;
    String size;
    int age;
    String color;


    // sets the info pf the dog
    public void setInfo(String dogName, String dogBread, String dogSize, int dogAge, String dogColor) {

        name = dogName;
        breed = dogBread;
        size = dogSize;
        age = dogAge;
        color = dogColor;
    }

    public void getInfo() {

        System.out.println(name + " " + breed + " " + size + " " + age + " " + color);

    }

    public void eat(String food) {

        System.out.println(name + " is eating " + food);
    }

    public  void drink(String drink) {

                System.out.println(name + " is drinking " + drink);
    }

    public void sleep(int sleep) {

        System.out.println(name + " is sleeping " + sleep + " hours");
    }


}
