package week7;

public class DanceStrategy implements IBehaviorStrategy{

	@Override
	public void behave(String context) {
		// TODO Auto-generated method stub
		System.out.println(context + "상관없음!");
		System.out.println("걍 춤추기");
		
	}

}
