package week7;

public class 짱구 {
	private IBehaviorStrategy strategy =null;
	
	public void setStrategy(IBehaviorStrategy strategy) {
		this.strategy = strategy;
		System.out.println("현재 짱구의 매너 전략은 "+strategy.getClass().getSimpleName());
	}
	
	//현재 상황에 따라서 뭘할지 결정하도록 하는 메서드
	public void encounterSituation(String situation) {
		System.out.println(situation +"상황발생!");
		if(this.strategy == null) {
			System.out.println("긁어긁어벅벅");
			return;
		}
		
		this.strategy.behave(situation);
		
	}
	

}
