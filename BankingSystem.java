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
            input = scanner.next();
            switch (input) {
                case "1" -> cashDeposit.addBalance(scanner);
                case "2" -> cashWithdrawl.withDrawBalance(scanner);
                case "3" -> balanceCheck.checkBalance();
                default -> System.exit(0);
            }
        }
    }
}
