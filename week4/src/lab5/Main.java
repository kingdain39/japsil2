package lab5;

public class Main {
	
	static BankAccount account = new BankAccount();

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread user1 = new Thread(new User(account));
		Thread user2 = new Thread(new User(account));
		user1.start();
		user2.start();

	}

}
