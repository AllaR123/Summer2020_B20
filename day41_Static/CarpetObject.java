package day41_Static;

import day41_Static.Cust_class_Carpet;

import java.util.ArrayList;

public class CarpetObject {

    public static void main(String[] args) {

        /*
        create a class called carpetObjects, and create an array of the carpet that contains 5 carpet objects
        ( make sure you set the instance variables of those objets)
            create two ArrayList of carpets:
                                        persianCarpets
                                        regularCarpets
            write a program to store all the persian Carpets into the list of persianCarpets,
            and store all regular carpets into the list of regularCarpets
                    use for each loop to print out all the persian carpets
         */




        Cust_class_Carpet[] carpets = {new Cust_class_Carpet(), new Cust_class_Carpet(), new Cust_class_Carpet(), new Cust_class_Carpet(), new Cust_class_Carpet()};

        carpets[0].customOrder(4.5, 3.3, 27.4, false);
        carpets[1].customOrder(3.2, 4.5, 27.3, true);
        carpets[2].customOrder(8.7, 6.6, 37.6, false);
        carpets[3].customOrder(4.5, 2.3, 24.8, true);
        carpets[4].customOrder(3.3, 4.4, 49.4, true);

        for (Cust_class_Carpet each : carpets) {
            each.getCarpetInfo();
        }


        ArrayList<Cust_class_Carpet> persianCarpets = new ArrayList<>();
        ArrayList<Cust_class_Carpet> regularCarpets = new ArrayList<>();

        for(int i = 0; i < carpets.length; i++) {
            if(carpets[i].isPersian) {
                persianCarpets.add(carpets[i]);
            } else {
                regularCarpets.add(carpets[i]);
            }
        }

        System.out.println("Number of persian carpets: " + persianCarpets.size());
        System.out.println("Number of none persian carpets: " + regularCarpets.size());

    }

}
