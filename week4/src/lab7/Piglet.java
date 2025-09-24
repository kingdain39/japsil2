package lab7;

public class Piglet implements Runnable{
	
	private final String name;
	int time;
	public Piglet(String name) {
		this.name = name;
		this.time = (int)(Math.random() *7000) +3000;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println(name+ ":  "+time/1000+"초 만큼 놀고 들어갈게용");
		try {
			Thread.sleep(time);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(name+ ":  "+"다 놀았어요!!!");
		
	}
	

}
