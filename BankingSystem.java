package BankingSystem;
import java.util.*;
import BankingSystem.Balance.Balance;
import BankingSystem.CheckBalance.BalanceCheck;
import BankingSystem.Deposit.CashDeposit;
import BankingSystem.Withdrawl.CashWithdrawl;

public class BankingSystem {
    public static void main(String arrgs[]){

    Balance balance = new Balance();
    BalanceCheck balanceCheck= new BalanceCheck(balance);
    CashDeposit cashDeposit= new CashDeposit(balance);
    CashWithdrawl cashWithdrawl= new CashWithdrawl(balance);

        Scanner scanner = new Scanner(System.in);
        String input;

        do {
            System.out.println("Select an option:");
            System.out.println("1. Cash Deposit");
            System.out.println("2. Cash Withdrawal");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");

            if (scanner.hasNextLine()) {
                input = scanner.nextLine();
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
        } while (!input.equals("4"));

        scanner.close();

}
}