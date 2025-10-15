package 커피메이커ver2;

public class Cash implements PaymentMethod{
	int money;
	public Cash(int money) {
		this.money = money;
	}

	@Override
	public void pay(int price) {
		// TODO Auto-generated method stub
		int change = money-price;
		System.out.println("현금 "+money+"원으로 "+price+ "원 결제(거스름돈 : "+change+"원)");
	}

}
