package day11_Ternary_Nested_if;

public class Days_In_Month {

    public static void main(String[] args) {




        /*
        2. write a program that can find the number of days in a month
        (Assume that Feb has 28 days)
         HINT:
                28 days: 2
                30 days: 4,6,9,11
                31 days: 1,3,5,7,8,10,12
         */

        int month = 3;
        String str = "";

        boolean days28 = month == 2;
        boolean days30 = month == 4 || month == 6 || month == 9 || month == 11;
        boolean invalid = month < 1 || month > 12;

        if(days28) {
            str = "28 days";
        } else if(days30) {
            str = "30 days";
        } else if(invalid) {
            str  = "Invalid";
        } else {
            str = "31 days";
        }
        System.out.println(str);
    }


}
