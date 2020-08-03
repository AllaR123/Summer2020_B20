package day31_Recap;

public class Method_ReverseString {

    public static void main(String[] args) {

        String b = reverse1("Kayak");
        System.out.println(b);
    }

    public static String reverse1(String  str) {

        String s = "";
        for(int i = str.length()-1; i >= 0; i--) {
            s += str.charAt(i);
        }

        return s;
    }
}
