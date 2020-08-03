package day28_Recap;

import java.util.Arrays;

public class MultyD_Practice {
    public static void main(String[] args) {

        String[] arr1D1 = {"Alla", "Denys", "Dan", "Mom"};
        String[] arr1D2 = {"Adam", "Rumiya", "Cristina", "Dad"};
        String[] arr1D3 = {"Conor", "Alim", "Anton", "Maria"};

        String[][]Batch20 = {arr1D1, arr1D2, arr1D3};

        System.out.println(Arrays.deepToString(Batch20));

        for (int i = 0; i <= Batch20.length - 1; i++) {
            String[] eachGroup = Batch20[i];
            //System.out.println( Arrays.toString(eachGroup)  );

            for (int j = 0; j <= eachGroup.length - 1; j++) {
                String eachStudent = eachGroup[j];
                if(eachStudent.toLowerCase().contains("m")) {
                    System.out.println(eachStudent + " ");
                }
            }
            System.out.println();
        }



    }
}
