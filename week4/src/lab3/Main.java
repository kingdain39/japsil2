package lab3;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Thread 상속
		Thread p1 = new Player1("짱구1", "부리부리", 20);
		Thread p2 = new Player1("흰둥이1", "왕", 20);
		Thread p3 = new Player1("맹구1", "맹",20);
		
		//Runnable 구현
		Thread pl1 = new Thread(new Player2("짱구2", "부리부리부리부리", 40));
		Thread pl2 = new Thread(new Player2("흰둥이2", "긁어긁어벅벅", 40));
		Thread pl3 = new Thread(new Player2("맹구2", "맹맹", 40));
		
		System.out.println(p1.getName());
		System.out.println(p2.getName());
		System.out.println(p3.getName());
		System.out.println(pl1.getName());
		System.out.println(pl2.getName());
		System.out.println(pl3.getName());
		
		p1.start();
		p2.start();
		p3.start();
		pl1.start();
		pl2.start();
		pl3.start();
		

	}

}
