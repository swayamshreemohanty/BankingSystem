package BankingSystem.Deposit;
import java.util.*;

import BankingSystem.Balance.Balance;
import BankingSystem.CheckBalance.BalanceCheck;

public class CashDeposit {
        Balance balance;
        BalanceCheck balanceCheck;
        Scanner scanner;
        public CashDeposit(Balance balanceInstance,BalanceCheck balanceCheckInstance, Scanner scannerInstance){
            balance=balanceInstance;
            scanner=scannerInstance;
            balanceCheck=balanceCheckInstance;
        }

    public void addBalance(){
            try {
                System.out.println("Enter the amount you want to deposit: ");
                long requiredBalance = Long.parseLong(scanner.next());
                balance.setBalance(requiredBalance);
                balanceCheck.checkBalance();
            }catch(Exception e){
                System.out.println(e.getMessage());
            }
    }

}
