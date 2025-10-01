package lab6;

public class Depositor extends Thread{
	private final BankAccountVer1 account;
	public Depositor(BankAccountVer1 account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			account.deposit(1000);
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	

}
