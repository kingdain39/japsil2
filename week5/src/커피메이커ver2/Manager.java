package 커피메이커ver2;

public class Manager {
	CoffeeMaker coffeeMaker;
	 Menu menu;
	 private final CoffeeFactory coffeeFactory;
	public Manager( CoffeeMaker coffeeMaker, Menu menu, CoffeeFactory coffeeFactory) {
		this.coffeeMaker = coffeeMaker;
		this.menu = menu;
		this.coffeeFactory = coffeeFactory;
	}
	
	public void getOrder(PaymentMethod paymentMethod, String order) {
		
		coffeeMaker.makeCoffee(coffeeFactory.prepareCoffeeIngredients(order));
		paymentMethod.pay(menu.getPrice(order));
		System.out.println("주문하신 " + order + "나왔습니다~");
	}

}
