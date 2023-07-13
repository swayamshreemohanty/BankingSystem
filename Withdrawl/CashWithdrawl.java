package BankingSystem.Withdrawl;
import BankingSystem.Balance.Balance;
import BankingSystem.CheckBalance.BalanceCheck;

import java.util.*;

public class CashWithdrawl {
    Balance balance;
    BalanceCheck balanceCheck;
    Scanner scanner;
    public CashWithdrawl(Balance balanceInstance,BalanceCheck balanceCheckInstance, Scanner scannerInstance){
        balance=balanceInstance;
        scanner=scannerInstance;
        balanceCheck=balanceCheckInstance;
    }
    public void withDrawBalance(){
        System.out.println("Enter the amount you want to withdrawl: ");
        long requiredBalance = Long.parseLong(scanner.next());
        balance.withdrawlBalance(requiredBalance);
        balanceCheck.checkBalance();
    }
}