package lab5;

public class BankAccount {
	
	int balance;
	public void deposite(int amount) {
		this.balance+=amount;
	}
	public void withdraw(int amount) {
		this.balance -=amount;
	}
	public int getBalance() {
		System.out.println("잔고: "+balance);
		return balance;
	}

}
