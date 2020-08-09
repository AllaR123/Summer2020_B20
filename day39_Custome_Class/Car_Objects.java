package day39_Custome_Class;

public class Car_Objects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.brand = "BMW";
        car1.color = "Black";
        car1.mileage = 50.600;
        car1.model = "i3";
        car1.price = 45.000;
        car1.year = 2018;

        System.out.println(car1.brand);
        System.out.println(car1.model);
        System.out.println(car1.color);
        System.out.println(car1.year);
        System.out.println(car1.mileage);
        System.out.println(car1.price);

        System.out.println("========================================");

        Car car2 = new Car();                   // did not initialize yet

        System.out.println(car2.brand);         // null
        System.out.println(car2.model);         // null
        System.out.println(car2.color);         // null
        System.out.println(car2.year);          // 0
        System.out.println(car2.mileage);       // 0.0
        System.out.println(car2.price);         // 0.0

        System.out.println("========================================");

        Car car3 = new Car();

        car3.brand = "Ford";
        car3.color = "White";
        car3.mileage = 70.600;
        car3.model = "Focus";
        car3.price = 20.000;
        car3.year = 2019;

        System.out.println(car3.brand);
        System.out.println(car3.model);
        System.out.println(car3.color);
        System.out.println(car3.year);
        System.out.println(car3.mileage);
        System.out.println(car3.price);

    }
}
