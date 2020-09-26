package day58_Polymorphism_Continue;

import day57_Polymorphism.DownloadTask.Phone;
import day57_Polymorphism.DownloadTask.Samsung;
import day57_Polymorphism.DownloadTask.iPhone;
import day58_Polymorphism_Continue.AnimalTask.Animal;
import day58_Polymorphism_Continue.AnimalTask.Cat;
import day58_Polymorphism_Continue.AnimalTask.Dog;

public class TypeCasting {

    public static void main(String[] args) {
        int a = 10;
        double b = a;

        Dog dog1 = new Dog(2, 'F', "Alisa");
        Cat cat1 = new Cat(2, 'F', "Tyson");

        Animal animal = dog1;  // done implicitly,

        Animal animal2 = cat1; // converting sub type to super type, implicitly

        // WebDriver driver = new ChromeDriver();
        //  driver = new FireFoxDriver();

        // ChromeDriver driver1 = new ChromeDriver();
        // WebDriver driver2 = driver1;  // implicitly done, upcasting

        System.out.println("=============================================");

        int x = 100;
        byte y = (byte)x; // MUST be done manually

        Animal animal3 = new Dog(2, 'F', "Alisa");
        // animal3.bark();

        Dog dog2 = (Dog)animal3;
        dog2.bark();


        Animal animal4 = new Cat(2, 'F', "Tyson");
        // Dog dog3 = (Dog) animal4;

        System.out.println("=======================================");

        iPhone phone1 = new iPhone("12", "6", 1200);
        Phone phone2 = phone1; // upcasting, implicitly

        Phone phone3 = new Samsung("S20", "9", 1100);
        Samsung phone4  = (Samsung)phone3; // manually, down casting

        iPhone phone5 =(iPhone)phone3;

        // WebDriver driver = new ChromeDriver();
        // TakeScreenShot ts = (TakeScreenShot)driver;


    }
}
