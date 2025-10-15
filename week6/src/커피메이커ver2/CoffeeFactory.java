package 커피메이커ver2;

import Ingredient.MilkThing;
import Ingredient.Water;
import Machine.CoffeeMachine;
import Machine.IceMaker;
import Machine.MilkFrother;
import Machine.WaterBoiler;
import Recipe.Americano;
import Recipe.Coffee;
import Recipe.Espresso;
import Recipe.Latte;

//커피팩토리

public class CoffeeFactory {

private final CoffeeMachine espressoMachine;
private final MilkFrother frother;
private final WaterBoiler waterBoiler;
private final IceMaker iceMaker;




public CoffeeFactory(CoffeeMachine espressoMachine, MilkFrother frother, WaterBoiler waterBoiler, IceMaker iceMaker) {

	this.espressoMachine = espressoMachine;
	this.frother = frother;
	this.waterBoiler = waterBoiler;
	this.iceMaker = iceMaker;
	
	

}



public Coffee prepareCoffeeIngredients(String name, String temp, String liqOption) {
	
		switch (name) {
		case "Latte":
			return new Latte(new Espresso(espressoMachine), new MilkThing(frother, liqOption),temp,iceMaker);
		case "Americano":
			return new Americano(new Espresso(espressoMachine), new Water(waterBoiler),temp,iceMaker);
		default:
			return new Espresso(espressoMachine);

		}
	
	
	

	}

}