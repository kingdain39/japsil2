package lab7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Thread p1 = new Thread(new Piglet("첫쨰"));
		Thread p2 = new Thread(new Piglet("둘쨰"));
		Thread p3 = new Thread(new Piglet("셋쨰"));
		
		p1.start();
		p2.start();
		p3.start();
		
		try {
			p1.join();
			p2.join();
			p3.join();
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("엄돼 : 다 도착했구나~");

	}

}
