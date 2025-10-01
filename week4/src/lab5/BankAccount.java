package lab5;

public class BankAccount {
	
	int balance;
	public synchronized void deposite(int amount) {
		this.balance+=amount;
	}
	public synchronized void withdraw(int amount) {
		this.balance -=amount;
	}
	public synchronized int getBalance() {
		System.out.println("잔고: "+balance);
		return balance;
	}

}
