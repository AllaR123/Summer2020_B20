package day06_Comparison_Operatord;

public class implicit_explicit {

    public static void main(String[] args) {

        short s1  = 100;
        long l1 = s1;       // implicit casting (automatically done )

        long l2 = l1;
        System.out.println(l2);     // 100

        int i = 300;
        double d = i;
        System.out.println(d);      // 300.0

        double zz = (int) i;
        System.out.println(zz);


        System.out.println("____----__________--------____________---------");

        long L1 = 400;
        short sh = (short)L1;
        System.out.println(sh);     // 400

        System.out.println("____----__________--------____________---------");

        int n1 = 1000;
        byte b1 = (byte)n1;
        System.out.println(b1);     // -24

        double d1 = 34.5;
        float f1 = (float)d1;
        System.out.println(f1);     // 34.5

    }
}
