package day12_Switch_Scanner;

public class OCA_example {

    public static void main(String[] args) {

        boolean keepGoing = true;
        int count = 0;
        int x = 3;

        while(count++ < 3){
            System.out.println("count= " + count);
            int y = (1 + 2 * count)% 3;
        switch (y) {
            default:
            case 0:
                x -= 1;
                break;
            case 1:
                x +=5;
        }

        }
        System.out.println(x);
    }
}
