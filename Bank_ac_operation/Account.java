import reqPack.*;
import java.util.Scanner;
public class Account implements Display{
	private int ac_balance=0;
	Scanner s;
	public static void main(String[] args) {
		Account a = new Account();
		a.deposite();
		a.balance();
	}
	public void deposite(){
		s = new Scanner(System.in);
		System.out.println("Enter Amount to be Deposited");
		int amt = s.nextInt();
		ac_balance += amt;
		System.out.println("Deposited "+amt);
	}
	public void withdraw(){
		s = new Scanner(System.in);
		System.out.println("Enter Amount to be Withdrawn");
		int amt = s.nextInt();
		if (amt<ac_balance) {
			ac_balance -= amt;
			System.out.println("Withdrawn "+amt);
		}else {
			System.out.println("Insufficient balance");
		}
		
	}
	public void balance(){
		System.out.println("Your Account balance is "+ac_balance);
	}
}
