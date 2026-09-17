public class ATM {

    public void showTransactionHistory(Account account) {

        System.out.println("\n===== TRANSACTION HISTORY =====");

        if (account.getTransactions().isEmpty()) {
            System.out.println("No transactions found.");
            return;
        }

        for (Transaction transaction : account.getTransactions()) {
            System.out.println(transaction);
        }
    }
}
