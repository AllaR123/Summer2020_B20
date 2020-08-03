package day29_Custome_Method;

public class RemoveDuplicates {
    public static void main(String[] args) {

        removeDup("abababababa");

    }

    public static void removeDup(String str) {

        String nonDup = "";
        for(String each : str.split("")) {
            if(!nonDup.contains(each)) {
                nonDup += each;
            }
        }
        System.out.println(nonDup);             // ab
    }
}
