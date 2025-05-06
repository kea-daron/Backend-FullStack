import model.Account;
import model.CreatingAccount;
import model.SavingAccount;

public class Main {
    public static void main(String[] args) {
        Account creatingAccount = new CreatingAccount();
        Account savingAccount = new SavingAccount();

        creatingAccount.setId(1);
        creatingAccount.setAccountName("John Doe");

        savingAccount.setId(2);
        savingAccount.setAccountName("Jane Doe");
    }
}