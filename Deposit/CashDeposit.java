package BankingSystem.Deposit;
import java.util.*;

public class CashDeposit {
    private static long balance;

    public static void main(String arrgs[]){

        Scanner input = new Scanner(System.in);
        long amt;
        System.out.println("Enter the amount you want to deposit: ");  

        amt = input.nextLong();
        input.close();
        balance = balance+amt;
    }

}
