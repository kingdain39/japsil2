package lab6;

public class BankAccountVer1 {
	private int balance = 0;
	private int totalDeposit = 0; //
	private int totalWithdraw = 0;
	
	public synchronized void deposit(int amount) {
		balance += amount;
		totalDeposit += amount;
		System.out.println("예금 : "+amount + "원 -> 잔액 : "+balance+"원");
	}
	
	public synchronized void withdraw(int amount) {
		if(balance>=amount) {
		balance -= amount;
		totalWithdraw += amount;
		System.out.println("출금 : "+amount + "원 -> 잔액 : "+balance+"원");
		}
		
		else {
			System.out.println("인출실패. 잔액부족입니다. (현재잔액: "+balance+"원)");
			}
	}

	public int getBalance() {
		System.out.println("총 저축액 : "+totalDeposit);
		System.out.println("총 인출액 : "+totalWithdraw);
		return balance;
	}
	
	

}



