package day53_Final_Keyword;

import java.time.LocalDate;

    public class FinalVariable {

        final static String eyeColor = "Brown";
        final String bloodType = "A";

        final int x; // final instance variables need to be initialized right away OR in the Constructor
        final static int y; // final static variables need to be initialized right away OR in the static block

        static{
            y = 300;
        }

        public FinalVariable(){

            x = 700;
        }


        public static void main(String[] args) {

            final LocalDate dateOfBirth = LocalDate.of(2000, 5, 7);

            //   dateOfBirth = LocalDate.of(1990, 6, 5); cannot be reassigned

            System.out.println(dateOfBirth);

            final long ssn = 1234567;
            //ssn = 987654;

            System.out.println(ssn);

            final double PI = 3.14;
            //  PI = 2.14;

            System.out.println(PI);


            final char gender = 'M';
            // gender = 'F';

            final String birthPlace = "USA";
            // birthPlace = "England";

            final int a;

            //  System.out.println(a);


        }

    }
