package lab6;

public class Main {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		BankAccountVer1 account = new BankAccountVer1();
		Thread depositor = new Depositor(account);
		Thread withdrawer = new Withdrawer(account);
		
		depositor.start();
		withdrawer.start();
		
		depositor.join();
		withdrawer.join();
		
		System.out.println("거래 종료, 현재 잔액 : "+account.getBalance()+"원");

	}

}
