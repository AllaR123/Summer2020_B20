package day37_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class Duplicates {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,1,2,22,3,4,5,5,5));

        list.removeIf(p -> Collections.frequency(list, p) == 1);
        System.out.println(list);           // [1, 1, 1, 1, 5, 5, 5]


        System.out.println("=================================");

        // keep name with first and last letter are the same

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Alla", "Anna", "Denys", "Canada", "Bob", "David"));

        names.removeIf(p -> p.toLowerCase().charAt(0) != p.charAt(p.length()-1));
        System.out.println(names);          // [Alla, Anna, Bob, David]

        System.out.println("=================================");


        // how many students made A, B, C, D
        ArrayList<Integer> grades = new ArrayList<>();
        grades.addAll(Arrays.asList(100,90,76,60,37));

        ArrayList<Integer> gradeaofA = new ArrayList<>();   // 90~100
        ArrayList<Integer> gradeaofB = new ArrayList<>();   // 80~89
        ArrayList<Integer> gradeaofC = new ArrayList<>();   // 70~79
        ArrayList<Integer> gradeaofD = new ArrayList<>();   // 0~69






    }
}
