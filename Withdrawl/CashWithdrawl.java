package BankingSystem.Withdrawl;
import BankingSystem.Balance.Balance;
import BankingSystem.CheckBalance.BalanceCheck;

import java.util.*;

public class CashWithdrawl {
    Balance balance;
    public CashWithdrawl(Balance balanceInstance){
        balance=balanceInstance;
    }


    public void withDrawBalance(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you want to widraw: ");

        long requiredBalance = input.nextLong();
        input.close();
        balance.widrawlBalance(requiredBalance);
        new BalanceCheck(balance).checkBalance();
    }
}