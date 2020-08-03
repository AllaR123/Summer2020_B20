package day19_For_Loop;

public class Palindrome {
    public static void main(String[] args) {

        // level ==> level; Alla ==> Alla

        String str = "level";
        String newSTr = "";
        for(int i = str.length()-1; i >= 0; i--) {
            newSTr += str.charAt(i);

        }
        System.out.println(newSTr);
        System.out.println(str.equals(newSTr));
    }
}
