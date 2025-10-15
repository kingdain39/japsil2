package week7;

public class SleepStrategy implements IBehaviorStrategy{

	@Override
	public void behave(String context) {
		// TODO Auto-generated method stub
		System.out.println(context+"상황 회피하기");
		System.out.println("쿨...");
		
	}

}
