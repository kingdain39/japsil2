package lab1;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thread클래스로 만든 쓰레드
		Thread t1 = new MyThread();
		t1.start(); //
		
		//Runnable인터페이스로 만든 쓰레드
		Thread t2 = new Thread(new MyRunnable());
		t2.start();

	}

}
