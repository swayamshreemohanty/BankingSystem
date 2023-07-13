package BankingSystem.CheckBalance;

public class BalanceCheck {
    Balance balance;

    BalanceCheck(Balance balanceInstance){
        balance=balanceInstance;
    }

    long checkBalance(){
        return balance.getBalance();
    }
}
