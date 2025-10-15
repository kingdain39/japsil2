package week7;

public class ActionMaskStrategy implements IBehaviorStrategy{

	@Override
	public void behave(String context) {
		System.out.println(context + "에 맞춰서!");
		System.out.println("정의로운 짱구짓");
		
	}

}
