public class Latte implements Coffee {
    private CoffeeMachine machine;
    private MilkFrother milkFrother;
    
    

    public Latte(CoffeeMachine machine, MilkFrother milkFrother) {
		super();
		this.machine = machine;
		this.milkFrother = milkFrother;
	}



	public String prepare(){
    	return machine.brew() +" + "+ milkFrother.frothMilk();
    }

}
