package day08_if_Statement;

public class Warm_Up {

    public static void main(String[] args) {

        /*
        warmup task:
    1. write a java program that converts gallons to liters
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    2. write a java program that converts litters to gallons
                        1 gallon = 3.785 liters
                        1 litter = 1/3.785
    3. manually calculate the following code fragements:
                1. int a = 200;
                    int b = -a++ + - --a * a-- % 2
                    b = ?
                2. int x = 300;
                   int y = 400;
                   int z = x + y - x * y +x / y;
         */

        double gallon = 100;
        double litter = gallon * 3.785;
        System.out.println(gallon + " gallons equals to " + litter + " litters");      // converts gallons to liters

        double gallon2 = 200;
        double litter2 = gallon2 / 3.785;
        System.out.println(litter2 + " litters equals to " + gallon2 + " gallons");       // converts litters to gallons


        int a = 200;    // -200
        int b = -a++ + - --a * a-- % 2; // -200 -200 * -200 % 2 ==> -200 - 40000 % 2 --> -200
        System.out.println(b);


        int x = 300;
        int y = 400;
        int z = x + y - x * y + x / y;  // 300 + 400 - 300 * 400 + 300 / 400 --> 300 + 400 - 12000 + 0.75
        System.out.println(z);   // 300 + 400 - 12000 + 0.75 --> 700 - 12000 + 0.75 = -1193000 + 0(integer) = -119300


    }
}
