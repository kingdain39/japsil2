package 커피메이커ver2;
public class Latte implements Coffee {
    private Espresso espresso;
    private MilkFrother milkFrother;
    private String liq;
  
    public Latte(Espresso espresso, MilkFrother milkFrother) {
		this.espresso = espresso;
		this.milkFrother = milkFrother;
	}

    @Override
	public String prepare(){
    	// TODO Auto-generated method stub
    	return espresso.prepare() +" + "+ milkFrother.frothMilk(liq);
    }



}
