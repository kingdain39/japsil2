package 커피메이커ver2;
public class Latte implements Coffee {
    private Espresso espresso;
    private MilkFrother milkFrother;
  
    public Latte(Espresso espresso, MilkFrother milkFrother) {
		this.espresso = espresso;
		this.milkFrother = milkFrother;
	}
    
	public String prepare(){
    	return espresso.prepare() +" + "+ milkFrother.frothMilk();
    }

}
