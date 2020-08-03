package day34_Wrapper_Class;

public class Wrapper_Class_Methods {

    public static void main(String[] args) {

        // parse ==> returns primitive

        String str = "123";
        int a = Integer.parseInt(str);
        System.out.println(a + 1);        // 1234
        System.out.println(str + 1);      // 1231

        String s = "7.5";                             // autoboxing
        Double d1 = Double.parseDouble(s);
        System.out.println(d1-1);         // 6.5


        String t = "true";
        boolean b = Boolean.parseBoolean(t);
        System.out.println(b);          // true

        String t2 = "TRUE";
        boolean b2 = Boolean.parseBoolean(t2);
        System.out.println(b2);          // true


        System.out.println("------------==============-------------");

        // valueOf ==>  returns Wrapper Class


        String s2 = "10000.5";
        Double d = Double.valueOf(s2);
        System.out.println(d);          // 10000.5

        String s3 = "FaLsE";                    // unboxing
        Boolean b3 = Boolean.valueOf(s3);
        System.out.println(b3);         //false

    }
}
