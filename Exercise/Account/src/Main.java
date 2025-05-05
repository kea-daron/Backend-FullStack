import model.Account;
import model.CreatingAccount;
import model.SavingAccount;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Account creatingAccount = new CreatingAccount();
        Account savingAccount = new SavingAccount();
        creatingAccount.setId(1);
        creatingAccount.setAccountName("John Doe");

    }
}