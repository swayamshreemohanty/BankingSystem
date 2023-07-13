package BankingSystem.Deposit;
import java.util.*;

import BankingSystem.Balance.Balance;
import BankingSystem.CheckBalance.BalanceCheck;

public class CashDeposit {
        Balance balance;
        public CashDeposit(Balance balanceInstance){
            balance=balanceInstance;
        }
    

    public void addBalance(Scanner scanner){
            try {
                System.out.println("Enter the amount you want to deposit: ");
                long requiredBalance = Long.parseLong(scanner.next());
                balance.setBalance(requiredBalance);
                new BalanceCheck(balance).checkBalance();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

}
