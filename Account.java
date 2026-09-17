import java.util.ArrayList;
public class Account {

    private String accountId;
    private String accountHolderName;
    private String pin;
    private double balance;
    private ArrayList<Transaction> transactions;
    public Account(String accountId, String accountHolderName, String pin, double balance) {
        this.accountId = accountId;
        this.accountHolderName = accountHolderName;
        this.pin = pin;
        this.balance = balance;
        this.transactions = new ArrayList<>();
    }

    public String getAccountId() {
        return accountId;
    }

    public String getAccountHolderName() {
        return accountHolderName;
    }

    public String getPin() {
        return pin;
    }

    public double getBalance() {
        return balance;
    }

    public void setPin(String pin) {
        this.pin = pin;
    }

    public void deposit(double amount) {
        balance = balance + amount;
        transactions.add(new Transaction("Deposit", amount));
    }

    public boolean withdraw(double amount) {
        if (amount <= balance) {
            balance = balance - amount;
            transactions.add(new Transaction("Withdrawal", amount));
            return true;
        }

        return false;
    }
    public ArrayList<Transaction> getTransactions() {
        return transactions;
    }
}
