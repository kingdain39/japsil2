
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EspressoMachine  espressoMachine = new EspressoMachine();
		DripCoffeeMachine dripCoffeeMachine = new DripCoffeeMachine();
		MilkFrother milkFrother = new MilkFrother();
		
		Coffee espresso = new Espresso(espressoMachine);
		System.out.println(espresso.prepare());
		Coffee americano = new Americano(espressoMachine);
		System.out.println(americano.prepare());
		Coffee latte = new Latte(espressoMachine, milkFrother);
		System.out.println(latte.prepare());
		
		
		//DI를 적용하여 라떼 생성해보기
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		coffeeMaker.setCoffee(latte);
		coffeeMaker.makeCoffee();
		
		
		

	}

}
