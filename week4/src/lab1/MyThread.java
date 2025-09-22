package lab1;
//Thread 클래스 상속 받기

public class MyThread extends Thread{
	//run()을 꼭 구현해야함
	public void run() {
		System.out.println("Thread 실행중 : " +Thread.currentThread().getName());
		work();
	}
	
	public void work(){
		for(int i=0; i<10; i++) {
			System.out.println("Thread로 만든 "+i);
			try {
				Thread.sleep(200);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}

}
