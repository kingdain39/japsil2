package 커피메이커ver2;
public class Espresso implements Coffee {
    private CoffeeMachine machine;
    
    

    public Espresso(CoffeeMachine machine) {
		super();
		this.machine = machine;
	}



	public String prepare(){
    	return machine.brew();
    }
}
