package week7;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		짱구 a = new 짱구();
		//전략이 없을 때 
		a.encounterSituation("내일 갑자기 시험");
		//1. 엄마가 심부름
		a.setStrategy(new SleepStrategy());
		a.encounterSituation("엄마가 귀찮은 심부름 시킴");
		
		
		//2. 훈이가 괴롭힘
		a.setStrategy(new DanceStrategy());
		a.encounterSituation("훈이가 괴롭힘을 당한다!!");
		
		
		//3. 유치원에서 장난
		a.setStrategy(new ActionMaskStrategy());
		a.encounterSituation("유치원에서 놀아요~~");
		
		
		

	}

}
