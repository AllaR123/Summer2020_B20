package day23_Array;

public class Array_Practice {
    public static void main(String[] args) {

        String[] students = {"Mike", "Adam", "Tony", "John", "Ammy"};
        int[] score = {85, 54, 90, 35, 75};


        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i] + " : " + score[i]);
        }

        System.out.println("===================================");

        String[] classMates = new String[5];
        classMates[0] = "Alla";
        classMates[2] = "Denys";
        classMates[1] = "Sasha";
        classMates[3] = "Mom";
        classMates[4] = "Dad";

        for(int i = 0; i < classMates.length; i++) {
            System.out.println(classMates[i]);
        }
    }
}
