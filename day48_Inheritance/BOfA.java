package day48_Inheritance;

public class BOfA {

    public static void main(String[] args) {

        BankAccount obj = new BankAccount("Alla", "Rudenko");


        obj.setAccountHolder(obj.firstName + " " + obj.lastName);
        System.out.println(obj.getAccountHolder());

        obj.setAccountNumber(232434);
        System.out.println(obj.getAccountNumber());

        obj.setBalance(500);
        System.out.println(obj.getBalance());

        obj.availableBalance();
        obj.deposit(300);
        obj.availableBalance();

        obj.withdraw(700);
    }
}
