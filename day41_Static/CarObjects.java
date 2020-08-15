package day41_Static;

public class CarObjects {

    public static void main(String[] args) {

        Car car1 = new Car();
        car1.seInfo("BMW", "i8", 2020, 80000, "black");


        // we are able to print car1 object, bc of toString method in Car class
        System.out.println(car1);
    }
}
