package BankingSystem.CheckBalance;
import BankingSystem.Balance.Balance;

import java.util.Scanner;

public class BalanceCheck {
    Balance balance;
    Scanner scanner;

    public BalanceCheck(Balance balanceInstance,Scanner scannerInstance){
        balance=balanceInstance;
        scanner=scannerInstance;
    }

   public void checkBalance(){
        long availableBalance=balance.getBalance();
        System.out.println("Balance Available: "+availableBalance);
    }
}
