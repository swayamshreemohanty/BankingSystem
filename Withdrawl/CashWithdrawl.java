package BankingSystem.Withdrawl;
import BankingSystem.Balance.Balance;
import BankingSystem.CheckBalance.BalanceCheck;

import java.util.*;

public class CashWithdrawl {
    Balance balance;
    public CashWithdrawl(Balance balanceInstance){
        balance=balanceInstance;
    }


    public void withDrawBalance(Scanner scanner){
        System.out.println("Enter the amount you want to withdrawl: ");
        long requiredBalance = Long.parseLong(scanner.next());
        balance.withdrawlBalance(requiredBalance);
        new BalanceCheck(balance).checkBalance();
    }
}