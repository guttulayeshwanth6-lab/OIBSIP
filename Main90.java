import java.util.ArrayList;
import java.util.Scanner;

public class Main90 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Create Account
        Account account = new Account(
                "1001",
                "Yeshwanth",
                "1234",
                10000.00
        );

        // Transaction History
        ArrayList<String> history = new ArrayList<>();

        // Welcome
        System.out.println("==============================");
        System.out.println("        WELCOME TO ATM        ");
        System.out.println("==============================");

        // Login
        System.out.print("Enter Account ID: ");
        String accountId = scanner.nextLine();

        System.out.print("Enter PIN: ");
        String pin = scanner.nextLine();

        // Check Login
        if (!accountId.equals("1001") || !pin.equals("1234")) {
            System.out.println("Invalid Account ID or PIN.");
            scanner.close();
            return;
        }

        System.out.println();
        System.out.println("Login successful!");
        System.out.println("Welcome, " + account.getAccountHolderName());

        // ATM Menu
        boolean running = true;

        while (running) {

            System.out.println();
            System.out.println("==============================");
            System.out.println("          ATM MENU            ");
            System.out.println("==============================");
            System.out.println("1. Check Balance");
            System.out.println("2. Deposit");
            System.out.println("3. Withdraw");
            System.out.println("4. Transaction History");
            System.out.println("5. Exit");
            System.out.println("==============================");

            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();

            System.out.println("You selected: " + choice);

            // OPTION 1 - CHECK BALANCE
            if (choice == 1) {

                System.out.println();
                System.out.println("Current Balance: ₹" + account.getBalance());

            }

            // OPTION 2 - DEPOSIT
            else if (choice == 2) {

                System.out.print("Enter deposit amount: ₹");
                double amount = scanner.nextDouble();

                if (amount > 0) {

                    account.deposit(amount);

                    history.add("Deposited: ₹" + amount);

                    System.out.println(
                            "₹" + amount + " deposited successfully."
                    );

                    System.out.println(
                            "New Balance: ₹" + account.getBalance()
                    );

                } else {

                    System.out.println("Invalid deposit amount.");
                }
            }

            // OPTION 3 - WITHDRAW
            else if (choice == 3) {

                System.out.print("Enter withdrawal amount: ₹");
                double amount = scanner.nextDouble();

                if (amount > 0) {

                    if (account.withdraw(amount)) {

                        history.add("Withdrawn: ₹" + amount);

                        System.out.println(
                                "₹" + amount +
                                " withdrawn successfully."
                        );

                        System.out.println(
                                "Remaining Balance: ₹" +
                                account.getBalance()
                        );

                    } else {

                        System.out.println("Insufficient balance.");
                    }

                } else {

                    System.out.println("Invalid withdrawal amount.");
                }
            }

            // OPTION 4 - TRANSACTION HISTORY
            else if (choice == 4) {

                System.out.println();
                System.out.println("==============================");
                System.out.println("     TRANSACTION HISTORY      ");
                System.out.println("==============================");

                if (history.isEmpty()) {

                    System.out.println("No transactions yet.");

                } else {

                    for (String transaction : history) {
                        System.out.println(transaction);
                    }
                }

                System.out.println("==============================");
            }

            // OPTION 5 - EXIT
            else if (choice == 5) {

                System.out.println();
                System.out.println("Thank you for using our ATM.");
                System.out.println("Please collect your card.");

                running = false;
            }

            // INVALID OPTION
            else {

                System.out.println("Invalid choice! Please enter 1-5.");
            }
        }

        scanner.close();
    }
}