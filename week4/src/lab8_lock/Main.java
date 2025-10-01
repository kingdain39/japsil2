package lab8_lock;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Object lock = new Object();
		Thread princess = new Princess(lock);
		Thread prince = new Prince(lock);
		princess.start();
		prince.start();

	}

}
