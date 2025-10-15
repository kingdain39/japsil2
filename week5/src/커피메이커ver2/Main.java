package 커피메이커ver2;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EspressoMachine  espressoMachine = new EspressoMachine();
		DripCoffeeMachine dripCoffeeMachine = new DripCoffeeMachine();
		MilkFrother milkFrother = new MilkFrother();
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		PaymentMethod payMethod ;
		Menu menu = new Menu();
		CoffeeFactory coffeeFactory = new CoffeeFactory(espressoMachine,milkFrother);
		Manager manager = new Manager(coffeeMaker, menu, coffeeFactory);
		

		System.out.println("--- 라떼 주문 (신용카드) ---");
        PaymentMethod creditCard = new CreditCard();
        manager.getOrder( creditCard, "Latte");
        
        System.out.println("\n--- 아메리카노 주문 (카카페) ---");
        PaymentMethod kakaoPay = new KakaoPay();
        manager.getOrder( kakaoPay,"Espresso");

        System.out.println("\n--- 아메리카노 주문 (현금) ---");
        PaymentMethod cash = new Cash(5000);
        manager.getOrder( cash,"Americano");
	}
}
