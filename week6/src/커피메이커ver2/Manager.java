package 커피메이커ver2;

import Pay.PaymentMethod;

public class Manager {
	CoffeeMaker coffeeMaker;
	 Menu menu;
	 private final CoffeeFactory coffeeFactory;
	public Manager( CoffeeMaker coffeeMaker, Menu menu, CoffeeFactory coffeeFactory) {
		this.coffeeMaker = coffeeMaker;
		this.menu = menu;
		this.coffeeFactory = coffeeFactory;
	}
	
	public void getOrder(PaymentMethod paymentMethod, String order, String temp, String liqOption) {
		
		coffeeMaker.makeCoffee(coffeeFactory.prepareCoffeeIngredients(order,temp,liqOption));
		paymentMethod.pay(menu.getPrice(order));
	}

}
