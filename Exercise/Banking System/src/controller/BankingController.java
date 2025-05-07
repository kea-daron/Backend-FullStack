package controller;

import model.SavingAccount;

import java.util.Scanner;
import java.util.UUID;

public class BankingController {
    private SavingAccount savingAccount;
    public BankingController() {
        System.out.println("-------> Please Create an account <-------");
        System.out.print("Enter Your Account Name: ");
        String accName = new Scanner(System.in).nextLine();
        this.savingAccount = new SavingAccount(UUID.randomUUID().toString() , accName , 0);
    }
    public void menu(){
        int choise;
        do {
            System.out.println("\n---> Banking Menu <---");
            System.out.println("1. Show Balance in Back ");
            System.out.println("2. Deposit to Bank ");
            System.out.println("3. Withdraw from Bank ");
            System.out.println("4. Exit");
            System.out.print("Enter choice: ");
            choise = new Scanner(System.in).nextInt();
            switch (choise){
                case 1 -> {
                    System.out.println("Show Balance in your Account");
                    System.out.println(savingAccount);
                }
                case 2 -> {
                    System.out.print("Input Balance: ");
                    double amount = new Scanner(System.in).nextDouble();
                    savingAccount.deposit(amount);
                    System.out.println("Deposited successfully.");
                }
                case 3 -> {
                    System.out.print("Enter With Drawl Amount : ");
                    double amount = new Scanner(System.in).nextDouble();
                    savingAccount.withdraw(amount);
                }

            }
        }while (choise !=4);
    }
}