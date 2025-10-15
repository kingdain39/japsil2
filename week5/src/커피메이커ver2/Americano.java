package 커피메이커ver2;
public class Americano implements Coffee {
    private Espresso shot;
    public Americano(Espresso shot) {
		this.shot = shot;
	}

	public String prepare(){
    	return shot.prepare() + " + " + "Hot Water";
    }
}
