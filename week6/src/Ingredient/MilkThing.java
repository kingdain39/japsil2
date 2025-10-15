package Ingredient;

import Machine.MilkFrother;

public class MilkThing implements Liquid{	
	private final MilkFrother milkFrother;
	private final String name;
	
	public MilkThing(MilkFrother milkFrother, String name) {
		this.milkFrother = milkFrother;
		this.name = name;
	}


	@Override
	public String getHotLiquid() {
		// TODO Auto-generated method stub
		return milkFrother.frothMilk(name);
	}



	@Override
	public String getColdLiquid() {
		// TODO Auto-generated method stub
		return "Cold " + name;
	}
}
