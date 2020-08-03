package day05_Arithnetical_Operators;

public class Practice {

    public static void main(String[] args) {
        String split ="=============================";
        String a1="a=(5+2)*4";
        int a =(5+2)*4;
        System.out.println(a1+"\n"+"a="+a+"\n"+split);
        String b1="b=10/(5-3)";
        int b=10/(5-3);
        System.out.println(b1+"\n"+"b="+b+"\n"+split);
        String c1="c=8+12*(6-2)";
        int c=8+12*(6-2);
        System.out.println(c1+"\n"+"c="+c+"\n"+split);
        String d1="d=(4+17)%2-1";
        int d=(4+17)%2-1;
        System.out.println(d1+"\n"+"d="+d+"\n"+split);
        String e1="e=(6-3)*(2+7)/3";
        int e = (6-3)*(2+7)/3;
        System.out.println(e1+"\n"+"e="+e+"\n"+split);
    }
}
