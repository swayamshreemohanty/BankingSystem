package BankingSystem;

import java.util.Scanner;
import BankingSystem.Balance.Balance;
import BankingSystem.CheckBalance.BalanceCheck;
import BankingSystem.Deposit.CashDeposit;
import BankingSystem.Withdrawl.CashWithdrawl;

public class BankingSystem {
    public static void main(String[] args) {
        Balance balance = new Balance();
        BalanceCheck balanceCheck = new BalanceCheck(balance);
        CashDeposit cashDeposit = new CashDeposit(balance);
        CashWithdrawl cashWithdrawl = new CashWithdrawl(balance);

        Scanner scanner = new Scanner(System.in);
        String input;

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Cash Deposit");
            System.out.println("2. Cash Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            if (scanner.hasNext()) {
                input = scanner.next();
            } else {
                // Handle the case where no input is available
                input = "";
                break;
            }

            switch (input) {
                case "1" -> cashDeposit.addBalance();
                case "2" -> cashWithdrawl.withDrawBalance();
                case "3" -> balanceCheck.checkBalance();
                default -> System.out.println("Invalid option. Please try again.");
            }

            if (input.equals("4")) {
                break; // Exit the loop if the user chooses option 4
            }
        }

        System.out.println("Program finished. Press Enter to exit.");
        scanner.nextLine(); // Waits for the Enter key before closing the console
        scanner.close();
    }
}
