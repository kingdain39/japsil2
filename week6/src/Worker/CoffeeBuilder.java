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

public class CoffeeBuilder {
    // 일단 기계들
    private final CoffeeMachine coffeeMachine; //에스프레소든 드립커피 머신이든 상관없게 해둠.
    private final MilkFrother frother;
    private final WaterBoiler waterBoiler;
    private final IceMaker iceMaker;

  //옵션
    private String coffeeType;
    private String temp; 
    private String liqOption; 

    // 생성자에서 필수 기계들을 먼저 주입
    public CoffeeBuilder(CoffeeMachine machine, MilkFrother frother, WaterBoiler boiler, IceMaker iceMaker) {
        this.coffeeMachine = machine;
        this.frother = frother;
        this.waterBoiler = boiler;
        this.iceMaker = iceMaker;
    }

    // 세터메서드들 ~~
    public CoffeeBuilder type(String coffeeType) {
        this.coffeeType = coffeeType;
        return this;
    }

    public CoffeeBuilder temperature(String temp) {
        this.temp = temp;
        return this;
    }

    public CoffeeBuilder liquidOption(String liqOption) {
        this.liqOption = liqOption;
        return this;
    }

    // 최종적으로 Recipe 객체를 생성하는 build() 메서드
    public Recipe build() {
        //boolean isCold = "ice".equalsIgnoreCase(temp);
        
        // iceMaker를 넣어주는데 매 케이스 마다 
        //IceMaker activeIceMaker = isCold ? this.iceMaker : null;

        switch (coffeeType) {
			case "Latte":
				return new Latte(new Espresso(coffeeMachine), new MilkThing(frother, liqOption),temp,iceMaker);
			case "Americano":
				return new Americano(new Espresso(coffeeMachine), new Water(waterBoiler),temp,iceMaker);
			default:
				return new Espresso(coffeeMachine);
            
        
    }
}
}