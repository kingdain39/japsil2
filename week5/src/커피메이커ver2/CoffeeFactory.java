package 커피메이커ver2;

//커피팩토리

public class CoffeeFactory {

private final CoffeeMachine espressoMachine;

private final MilkFrother frother;



public CoffeeFactory(CoffeeMachine espressoMachine, MilkFrother frother) {

	this.espressoMachine = espressoMachine;
	this.frother = frother;

}



public Coffee prepareCoffeeIngredients(String name, String temp, String liqOption) {
	if(temp.equalsIgnoreCase("hot")) {
		switch (name) {
		case "Latte":
			return new Latte(new Espresso(espressoMachine), frother);
		case "Americano":
			return new Americano(new Espresso(espressoMachine));
		default:
			return new Espresso(espressoMachine);

		}
	}
	else {
		switch (name) {
		case "Latte":
			return new Latte(new Espresso(espressoMachine), );
		case "Americano":
			return new Americano(new Espresso(espressoMachine));
		default:
			return new Espresso(espressoMachine);

		
	}
	

	}

}