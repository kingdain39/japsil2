package lab1;
//Runnable 인터페이스 구현 하여 쓰레드 만들기

public class MyRunnable implements Runnable{

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable 실행 중: "+ Thread.currentThread().getName());
		work();
	}
	
	
	public void work(){
		for(int i=0; i<10; i++) {
			System.out.println("Runnable로 만든 "+ (i));
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
