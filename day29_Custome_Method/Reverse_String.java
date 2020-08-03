package day29_Custome_Method;

public class Reverse_String {

    public static void main(String[] args) {

        reverseString("poiuytrewq");
    }

    public static void reverseString(String str) {

        String res = "";

        for(int i = str.length()-1; i > 0; i--) {
            res += str.charAt(i);

        }
        System.out.print(res + " ");
    }
}
