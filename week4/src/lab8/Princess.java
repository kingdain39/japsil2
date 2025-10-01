package lab8;

public class Princess extends Thread{
	public  Princess() {}
	
	public void run() {
		synchronized(this) {
			
			try {
				System.out.println("공주 : 잠자고 있는 중 ...");
				wait();
				System.out.println("공주 : 왕자가 깨움");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}
}
