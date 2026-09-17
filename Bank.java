import java.util.ArrayList;

public class Bank {

    private ArrayList<Account> accounts;

    public Bank() {
        accounts = new ArrayList<>();
    }

    public void addAccount(Account account) {
        accounts.add(account);
    }

    public Account findAccount(String accountId) {

        for (Account account : accounts) {

            if (account.getAccountId().equals(accountId)) {
                return account;
            }
        }

        return null;
    }

    public boolean authenticate(String accountId, String pin) {

        Account account = findAccount(accountId);

        if (account != null && account.getPin().equals(pin)) {
            return true;
        }

        return false;
    }
}