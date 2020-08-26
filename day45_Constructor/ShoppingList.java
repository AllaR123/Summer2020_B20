package day45_Constructor;

import java.util.ArrayList;
import java.util.Arrays;

public class ShoppingList {

    /*
    create a class called ShoppingList
                create 5 objects of Item and store them into List of Items
                calculate the total cost of all Items in the list
     */

    public static void main(String[] args) {

        Item item1 = new Item("Rice",3.99,1);
        Item item2 = new Item("Beans",5.99,1);
        Item item3 = new Item("Chickpeas",3.99,3);
        Item item4 = new Item("Lentils",2.99,2);
        Item item5 = new Item("Cilantro",0.99,5);

       ArrayList<Item> list = new ArrayList<>();
       list.addAll(Arrays.asList(item1, item2, item3, item4, item5));
        System.out.println(list.size());

        double totalCoast = 0;

        for(Item each : list) {

           totalCoast +=  each.calcCost();

        }

        System.out.println("Total coast: " + totalCoast);

    }
}