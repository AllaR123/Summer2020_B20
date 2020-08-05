package day38_ArrayList_Recap;

import java.util.ArrayList;
import java.util.Arrays;

public class GradeReport {

    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.addAll(Arrays.asList(100,90,85,75,66,56,73,73,35,47,60,87,77,67,57,47,83,73,63,53,43));
        System.out.println(list);

        ArrayList<Integer> gradeA = new ArrayList<>();      // 90 ~ 100
        gradeA.addAll(list);
        gradeA.removeIf(each -> each < 90);
        System.out.println("Grade A: " + gradeA);

        ArrayList<Integer> gradeB = new ArrayList<>();      // 80 ~ 90
        gradeB.addAll(list);
        gradeB.removeIf(p -> p < 80 || p > 89);
        System.out.println("Grade B: " + gradeB);

        ArrayList<Integer> gradeC = new ArrayList<>();      // 70 ~ 80
        gradeC.addAll(list);
        gradeC.removeIf(p -> p < 70 || p > 79);
        System.out.println("Grade C: " + gradeC);

        ArrayList<Integer> gradeD = new ArrayList<>();      // 60 ~ 70
        gradeD.addAll(list);
        gradeD.removeIf(p -> p < 60 || p > 69);
        System.out.println("Grade D: " + gradeD);

        ArrayList<Integer> gradeE = new ArrayList<>();      // 0 ~ 59
        gradeE.addAll(list);
        gradeE.removeIf(p -> p < 0 || p > 59);
        System.out.println("Grade E: " + gradeE);



    }
}
