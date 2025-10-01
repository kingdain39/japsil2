package lab8;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Thread princess = new Princess();
		Thread prince = new Prince(princess);
		princess.start();
		prince.start();
	}

}
