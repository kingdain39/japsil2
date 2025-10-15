package 커피메이커ver2;
public class Americano implements Coffee {
    private Espresso shot;
    private WaterBoiler waterBoiler;
    public Americano(Espresso shot, WaterBoiler waterBoliler) {
		this.shot = shot;
		this.waterBoiler = waterBoliler;
	}

	public String prepare(){
    	return shot.prepare() + " + " + "Hot Water";
    }
}
