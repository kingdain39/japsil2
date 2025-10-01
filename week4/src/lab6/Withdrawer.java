package lab6;

public class Withdrawer extends Thread {
	private final BankAccountVer1 account;
	public Withdrawer(BankAccountVer1 account) {
		this.account = account;
	}
	
	@Override
	public void run() {
		for(int i=0; i<10; i++) {
			account.withdraw(1500);
			try {
				Thread.sleep(800);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
	
}
