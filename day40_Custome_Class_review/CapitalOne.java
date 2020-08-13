package day40_Custome_Class_review;

import java.util.ArrayList;
import java.util.Arrays;

public class CapitalOne {

    public static void main(String[] args) {

        BankAccount Alla = new BankAccount();
        BankAccount Denys = new BankAccount();
        BankAccount Adam = new BankAccount();
        BankAccount Rumi = new BankAccount();
        BankAccount Stani = new BankAccount();

        Alla.setAccountInfo("Checking", "Alla", "12344566778");
        Denys.setAccountInfo("Checking", "Denys", "7866453424");
        Adam.setAccountInfo("Checking", "Adam", "796745645343");
        Rumi.setAccountInfo("Checking", "Rumi", "232434546546");
        Stani.setAccountInfo("Checking", "Stani", "58674563453");


        ArrayList<BankAccount> accounts = new ArrayList<>();
        accounts.addAll(Arrays.asList(Alla, Denys, Adam, Rumi, Stani));

        for(BankAccount each : accounts) {
            each.deposit(500);
            each.getAccountInfo();

        }

        accounts.get(0).deposit(10000);
        accounts.get(0).checkBalance();
        accounts.get(0).withDraw(9000);
        accounts.get(0).checkBalance();

        accounts.get(4).deposit(600);
        accounts.get(4).checkBalance();

        System.out.println("************************************************");
        accounts.removeIf(p -> p.balance < 1000);
        for(BankAccount each : accounts) {
            each.getAccountInfo();
        }

    }
}