package lab8_lock;

public class Prince extends Thread {
	private final Object lock;
	
	public Prince(Object lock) {
		this.lock = lock;
	}
	
	public void kissPrincess() {
		synchronized(lock) {
			System.out.println("왕자 : 공주깨움");
			lock.notify();
		}
	}
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		kissPrincess();
	}

}
