package day40_Custome_Class_review;

public class BOfA {

    public static void main(String[] args) {

            BankAccount Dawud = new BankAccount();
            Dawud.setAccountInfo("Saving", "Dawud Abduwali", "123455786");
            Dawud.getAccountInfo();
            System.out.println("---------------------------------");
            Dawud.deposit(1000);
            Dawud.checkBalance();
            System.out.println("---------------------------------");
            Dawud.withDraw(500);
            Dawud.checkBalance(); // 500
            System.out.println("---------------------------------");
            Dawud.withDraw(100000);
            Dawud.checkBalance();


    }
}
