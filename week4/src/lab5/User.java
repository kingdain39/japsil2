package lab5;

public class User implements Runnable{
	
	BankAccount account;
	public User(BankAccount account) {
		this.account = account;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		for(int i=0; i<10; i++) {
			account.deposite(10000);
			try {
				Thread.sleep(50);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			account.withdraw(10000);
			if(account.getBalance()<0) {
				System.out.println("돈없음");
			}
		}
		
	}

}
