package day34_Wrapper_Class;

import java.util.ArrayList;
import java.util.List;

public class List_Practice2 {

    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        list.add(10);
        list.add(300);
        list.add(45);
        list.add(88);
        list.add(1);

        int max = Integer.MIN_VALUE;
        for(Integer each : list) {
            if(each > max) {
                max = each;
            }
        }

        System.out.println("Max: "+ max);
    }
}
