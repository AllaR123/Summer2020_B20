package day37_ArrayList_Continue;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Predicate;

public class Lambda_Expression {
    public static void main(String[] args) {


        // removeIf():

        // remove numbers from the list that are less than 5 using lambda
        // Lambda needed for removing elements using predicate

        ArrayList<Integer> list = new ArrayList<>();
        list.addAll(Arrays.asList(1,1,1,2,3,4,4,4,5,6,7,8,9));

        Predicate<Integer> lessThan5 = p -> p < 5;      // predicate - bl// boolean expression

        list.removeIf(lessThan5);
        System.out.println(list);

        System.out.println("=====================================");


        Predicate<Integer> oddNumbers = p -> p % 2 != 0;

        ArrayList<Integer> numbers = new ArrayList<>();

        for(int i = 0; i <= 100; i++) {
            numbers.add(i);
        }

        numbers.removeIf(oddNumbers);     // remove if the numbers is odd

        // OR we can give predicate right away
        numbers.removeIf(p -> p % 2 == 0);      // remove if the number is even

        System.out.println(numbers);        // [] list is empty, bc we remove all the numbers


        System.out.println("--------------------------------------");


        // remove all the name that start with 'M'

        ArrayList<String> names = new ArrayList<>();
        names.addAll(Arrays.asList("Mary", "Monica", "Mehrey", "Musti", "Sumeyra", "Hasan","Beril"));

        System.out.println(names);

        names.removeIf(p -> p.startsWith("M") && p.endsWith("y"));
        System.out.println(names);                  // [Monica, Musti, Sumeyra, Hasan, Beril]

    }
}
