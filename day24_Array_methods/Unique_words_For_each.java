package day24_Array_methods;

public class Unique_words_For_each {

    public static void main(String[] args) {

            String[] words = {"C#", "C#", "Java", "Python", "C++"};

            for(String each2 : words) {
                int count = 0;

                for (String each : words) {
                    if (each == each2) {
                        count++;
                    }
                }
                if (count == 1) {
                    System.out.println(each2);
                }
            }

    }
}
