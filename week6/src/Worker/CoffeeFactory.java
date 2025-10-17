package Worker;

import Ingredient.MilkThing;
import Ingredient.Water;
import Machine.CoffeeMachine;
import Machine.IceMaker;
import Machine.MilkFrother;
import Machine.WaterBoiler;
import Recipe.Americano;
import Recipe.Espresso;
import Recipe.Latte;
import Recipe.Recipe;

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


public Recipe prepareCoffeeIngredients(String name, String temp, String liqOption) {
	
	return new CoffeeBuilder(espressoMachine, frother, waterBoiler, iceMaker)
            .type(name)
            .temperature(temp)
            .liquidOption(liqOption)
            .build();

		}

	}

