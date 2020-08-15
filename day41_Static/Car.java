package day41_Static;

public class Car {

    String brand;
    String model;
    int year;
    double price;
    String color;

    public void seInfo(String brand, String model, int year, double price, String color) {

        this.brand = brand;
        this.model = model;
        this.year = year;
        this.price = price;
        this.color = color;

    }

    public String toString() {

        return brand + " " + model + " " + year + " " + price + " " + color;
    }

}
