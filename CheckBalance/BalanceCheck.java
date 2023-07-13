package BankingSystem.CheckBalance;
import BankingSystem.Balance.Balance;

public class BalanceCheck {
    Balance balance;
    public BalanceCheck(Balance balanceInstance){
        balance=balanceInstance;
    }

   public void checkBalance(){
        long availableBalance=balance.getBalance();
        System.out.println("Balance Available: "+availableBalance);
    }
}
