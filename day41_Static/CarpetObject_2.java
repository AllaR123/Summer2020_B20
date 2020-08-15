package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CarpetObject_2 {

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


    public static void main(String[] args) {


        Cust_class_Carpet[] carpets = {new Cust_class_Carpet(), new Cust_class_Carpet(), new Cust_class_Carpet(), new Cust_class_Carpet(), new Cust_class_Carpet()};

        carpets[0].customOrder(4.5, 3.3, 27.4, false);
        carpets[1].customOrder(3.2, 4.5, 27.3, true);
        carpets[2].customOrder(8.7, 6.6, 37.6, false);
        carpets[3].customOrder(4.5, 2.3, 24.8, true);
        carpets[4].customOrder(3.3, 4.4, 49.4, true);


        ArrayList<Cust_class_Carpet> persianCarpets = new ArrayList<>();
        persianCarpets.addAll(Arrays.asList(carpets));
        persianCarpets.removeIf(p -> !p.isPersian);

        ArrayList<Cust_class_Carpet> regularCarpets = new ArrayList<>();
        regularCarpets.addAll(Arrays.asList(carpets));
       // regularCarpets.removeIf(p -> p.isPersian);    OR
        regularCarpets.removeAll(persianCarpets);


        System.out.println("Number of persian carpets: " + persianCarpets.size());
        System.out.println("Number of persian carpets: " + regularCarpets.size());

    }
}