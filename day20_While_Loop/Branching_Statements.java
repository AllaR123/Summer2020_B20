package day20_While_Loop;

public class Branching_Statements {
    public static void main(String[] args) {


        // print form 'A' to 'E' except 'C'

        char ch = 'A';
        while (ch <= 'E') {
            if( ch == 'C') {
                ch++;
                continue;               // skips everything
            }
            System.out.println(ch + " ");
            ch++;
        }

        if(true) {
            System.out.println("Not done yet");
            System.exit(0);     // program will stop. Done will not be exicuted
        }
        System.out.println("Done");

    }
}
