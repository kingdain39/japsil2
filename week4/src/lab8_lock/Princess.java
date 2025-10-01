package lab8_lock;

public class Princess extends Thread{
	private final Object lock;
	
	public Princess(Object lock) {
		this.lock = lock;
	}
	
	public void run() {
		synchronized(lock) {
			
			try {
				System.out.println("공주 : 잠자고 있는 중 ...");
				lock.wait();
				System.out.println("공주 : 왕자가 깨움");
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
		}
	}

}
