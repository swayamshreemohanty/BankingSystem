package BankingSystem.Deposit;
import java.util.*;

import BankingSystem.Balance.Balance;
import BankingSystem.CheckBalance.BalanceCheck;

public class CashDeposit {
        Balance balance;
        public CashDeposit(Balance balanceInstance){
            balance=balanceInstance;
        }
    

    public void addBalance(){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the amount you want to deposit: ");
        long requiredBalance = input.nextLong();
        balance.setBalance(requiredBalance);
        new BalanceCheck(balance).checkBalance();
        input.close();
    }

}
