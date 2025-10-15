package Ingredient;

import Machine.WaterBoiler;

public class Water implements Liquid{
	 private final WaterBoiler boiler;

	 public Water(WaterBoiler boiler) {
	    this.boiler = boiler;
	 }

	@Override
	public String getHotLiquid() {
		// TODO Auto-generated method stub
		return boiler.boilWater();
	}

	@Override
	public String getColdLiquid() {
		// TODO Auto-generated method stub
		return "Cold Water";
	}

}
