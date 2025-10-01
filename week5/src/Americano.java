public class Americano implements Coffee {
    private CoffeeMachine machine;
    
    

    public Americano(CoffeeMachine machine) {
		super();
		this.machine = machine;
	}



	public String prepare(){
    	return machine.brew() + " + "+"Hot Water";
    }

}
