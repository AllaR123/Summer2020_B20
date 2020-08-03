package day15_String;

public class String_concat {
    public static void main(String[] args) {

        String schoolName = "Cybertek";
       schoolName  =schoolName.concat(" school");

        System.out.println(schoolName);

        String r1 = "Cybertek" + 123 + 'A' + true;
        System.out.println(r1);

        // concat (we only use this method to concat String data type)

       // String r2 = "Cybertek".concat(123);       now allowed concat any other data types


        // concat first name and last name

        String firstName = "Alla";
        String lastName = "Rudenko";
        String fullName = firstName.concat(" ").concat(lastName);
        System.out.println(fullName);

    }
}
