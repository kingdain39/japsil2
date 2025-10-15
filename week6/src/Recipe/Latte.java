package Recipe;

import Ingredient.MilkThing;
import Machine.IceMaker;
import Machine.MilkFrother;

public class Latte implements Coffee {
    private Espresso shot;
    private MilkThing milk;
    private IceMaker iceMaker;
    private String temp;
    
    public Latte(Espresso shot, MilkThing milk, String temp, IceMaker iceMaker) {
		this.shot = shot;
		this.milk = milk;
		this.temp = temp;
		this.iceMaker = iceMaker;
	}

    @Override
	public String prepare(){
    	// TODO Auto-generated method stub
    	if(temp.equalsIgnoreCase("hot")) return shot.prepare() + milk.getHotLiquid();
		else return shot.prepare() +" + " + milk.getColdLiquid()+ " + " + iceMaker.getIce();
    	
    	
    }



}
