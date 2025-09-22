package lab4;

public class Car extends Thread{
	String name;
	int speed;
	volatile boolean stop = false;
	
	public Car(String name, int speed) {
		this.name = name;
		this.speed = speed;
		System.out.println(name + " 생성 ");
	}
	
	public void run() {
		for(int i=0; i<=자동차경주.goal; i++) {
			System.out.println(name+ ": "+ i + "km ..");
			
			if((int)(Math.random()*10000)%100<5) {
				System.out.println("고장남!!!!!!!!!!!!!");
				this.interrupt();
			}
			
			if(Thread.interrupted()) {
				System.out.println("name" + " : " +i+ "km 지점에서 interrupt 감지!! 쓰레드 종료!");
				return;
			}
			
			try {
				Thread.sleep(300);
			}catch(InterruptedException e) {
				System.out.println(name+ " : sleep 도중 interrupt 발생!" + e.getMessage() );
				return;
			}
			
		}
		System.out.println(name+ "도착");
	}


}
