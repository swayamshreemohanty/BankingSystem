package BankingSystem.Balance;

public class Balance {
  static private long balance=0;

    public long getBalance(){
        return balance;
    }

 public void setBalance(long newBalance){
        balance+=newBalance;
        return;
    }

    public void withdrawlBalance(long requiredBalance){
        balance-=requiredBalance;
        return;
    }
}
