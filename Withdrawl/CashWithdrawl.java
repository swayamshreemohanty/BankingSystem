package BankingSystem.Withdrawl;
import java.util.*;

public class CashWithdrawl {
    private static long balance;
    public static void main(String arrgs[]){
        Scanner input = new Scanner(System.in);

        long amt;
    System.out.println("Enter the amout you want to withraw: ");
    amt = input.nextLong();
    input.close();
    
    if(balance >= amt){
        balance = balance - amt;
        System.out.println("Balance after withdrawl: " + balance);
    }
    else{
        System.out.println("Insufficient fund");
    }
    }
    
}