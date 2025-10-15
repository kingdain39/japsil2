package Recipe;

import Machine.CoffeeMachine;

public class Espresso implements Coffee {
    private CoffeeMachine machine;
    public Espresso(CoffeeMachine machine) {
		this.machine = machine;
	}
	public String prepare(){
    	return machine.brew();
    }
}
