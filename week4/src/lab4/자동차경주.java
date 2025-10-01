package lab4;

public class 자동차경주 {
	static int goal = 30;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int goal = 100;
		Thread car1 = new Car("붕붕이", 1000);
		Thread car2 = new Car("씽씽이", 100);
		Thread car3 = new Car("세발 자전거", 3000);
		
		System.out.println("---------------자동차 경주 시작 ------------------");
		car1.start();
		car2.start();
		car3.start();
		
		try {
			Thread.sleep(3000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		car2.interrupt(); //3초후 씽씽이에게 interrupt넣어줌. (외부에서 interrupt)들어가는 상황

	}

}
