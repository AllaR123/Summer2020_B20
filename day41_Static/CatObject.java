package day41_Static;

import java.util.ArrayList;
import java.util.Arrays;

public class CatObject {

    public static void main(String[] args) {

        /*
        CatObjects:
            create 5 objects of Cat and store them into an array variable
            print out the information of every single cat
                    (DO NOT use getInfo method)
            ArrayList:
                maleCats
                femaleCats
                first approach: apply loop ( both for each loop and for loop)
                second approach: do not use loop

         */

        Cat[] cats = {new Cat(), new Cat(), new Cat(), new Cat(), new Cat()};

        cats[0].seInfo("Alisa", 3, 'F', "lop-eared");
        cats[0].eat("dry food");
        cats[1].seInfo("Max", 6, 'M', "Siamese");
        cats[1].drink("milk");
        cats[2].seInfo("Tyson", 7, 'M', "Has no bread");
        cats[2].eat("dry food");
        cats[3].seInfo("Muffin", 3, 'F', "lynx");
        cats[3].drink("milk");
        cats[4].seInfo("Cloud", 9, 'M', "Lion");
        cats[4].drink("water");

        for(Cat each : cats) {
            System.out.println(each);
        }

        System.out.println("=================================================");

        ArrayList<Cat> maleCats = new ArrayList<>();
        ArrayList<Cat> femaleCats = new ArrayList<>();


        for( int i= 0; i < cats.length; i++) {
            if(cats[i].gender == 'M') {
                maleCats.add(cats[i]);
            } else {
                femaleCats.add(cats[i]);
            }
        }

        /*          OR
        maleCats.addAll(Arrays.asList(cats));
        maleCats.removeIf(p -> p.gender == 'F');
        femaleCats.addAll(Arrays.asList(cats));
        femaleCats.removeIf(p -> p.gender == 'M');

         */


        System.out.println(maleCats);
        System.out.println(femaleCats);
        System.out.println("Amount of Male cats: " + maleCats.size());
        System.out.println("Amount of Female cats: " + femaleCats.size());


    }
    }
