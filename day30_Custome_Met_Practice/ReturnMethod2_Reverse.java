package day30_Custome_Met_Practice;

public class ReturnMethod2_Reverse {

    public static void main(String[] args) {

        String name = "Level";
        //revStr1(name);
        //System.out.println(name.equalsIgnoreCase(revStr1(name)));   void does not return value

        String str = revStr2(name);
        System.out.println(name.equalsIgnoreCase(revStr2(name)));

    }

    public static void revStr1(String str) {

        String res = "";
        for(int i = str.length()-1; i >= 0; i--) {
            res += str.charAt(i);
        }

        System.out.println(res);
    }

    public static String revStr2(String str) {

        String res = "";
        for(int i = str.length()-1; i >= 0; i--) {
            res += str.charAt(i);
        }
        return res;
    }
}
