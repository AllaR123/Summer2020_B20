package day28_Recap;

public class Frequency_of_String {

    public static void main(String[] args) {

        String str = "javajavajava";
        // java

        int count = 0;
        for (int i = 0; i <= str.length()-4; i++) { // i: 0, 1, 2, 3, 4
            String s = str.substring(i, i+4);
            if(s.equals("java")) {
                count++;
            }
        }
        System.out.println(count);
    }
}
