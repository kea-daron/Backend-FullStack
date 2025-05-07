package model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import model.abstrack.BankingService;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Account implements BankingService {
    private String uuid;
    private String AccountName;
    private double balance;

    @Override
    public void deposit(double amount) {
       if (amount > 0){
           balance = balance + amount;
       }

    }

    @Override
    public void withdraw(double amount) {
        if (amount > balance){
            System.out.println("You do not have enough money.");
            System.out.println("Please check your account balance.");
        }else {
            balance = balance - amount;
            System.out.println("Withdraw successfully.");
        }
    }

    @Override
    public String toString() {
        return
                " Account UUID: " + uuid + '\n' +
                " Account Name: " + AccountName + '\n' +
                " USA Balance: $"  +  balance + '\n' +
                " Khmer Balance: riel" + (balance * 4000);
    }


}