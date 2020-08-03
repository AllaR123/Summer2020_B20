package day19_For_Loop;

public class BreakStatement {
    public static void main(String[] args) {

        for(int i = 0; i < 5; i++) {
            System.out.println("Hello");
            break;
        }

        System.out.println("=============================");
        for(char ch = 'A'; ch <= 'H'; ch++) {
            System.out.println(ch +  " ");
            if(ch == 'C') {
                break;
            }
        }
        System.out.println("-------------------------------");
        for(int i = 10; i <= 50; i += 10) {
            if(i == 30) {
                System.out.println(i);      // 30
                break;
            }
        }

        System.out.println("*******************************");
        for(int x = 1000; x >= 100; x-= 100) {
            if(x == 500) {
                break;
            }
            System.out.println(x);      // 1000, 900, 800, 700, 600
        }


    }
}
