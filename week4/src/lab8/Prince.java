package lab8;

public class Prince extends Thread{
	Thread target;
	public Prince(Thread target) {
		this.target = target;
	}
	
	public void kissPrincess(Thread target) {
		synchronized (target) {
			System.out.println("왕자 : 공주깨움");
			target.notify();
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
		kissPrincess(target);
	}
	
	

}
