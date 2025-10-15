package Recipe;

import Ingredient.Water;
import Machine.IceMaker;

public class Americano implements Coffee {
    private Espresso shot;
    private Water water;
    private String temp;
    private IceMaker iceMaker;
    public Americano(Espresso shot, Water water, String temp, IceMaker iceMaker) {
		this.shot = shot;
		this.water = water;
		this.temp = temp;
		this.iceMaker = iceMaker;
	}

	public String prepare(){
		if(temp.equalsIgnoreCase("hot")) return shot.prepare() + water.getHotLiquid();
		else return shot.prepare() +" + " + water.getColdLiquid()+ " + " + iceMaker.getIce();
    	
    }
}
