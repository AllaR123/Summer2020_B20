package day39_Custome_Class;

public class Dog_Object {

    public static void main(String[] args) {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();

        dog1.setInfo("Alisa", "Husky", "Big", 3, "white");
        dog2.setInfo("Muffin", "Pitbull", "Big", 7, "gold");
        dog3.setInfo("Tyson", "Boxer", "big", 4, "Black");

        dog1.getInfo();
        dog2.getInfo();
        dog3.getInfo();


        System.out.println("============================================");
        dog1.sleep(12);
        dog2.drink("water");
        dog3.eat("Kelle Paca");




    }
}
