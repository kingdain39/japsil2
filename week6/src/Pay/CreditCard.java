package Pay;

public class CreditCard implements PaymentMethod{

	@Override
	public void pay(int price) {
		// TODO Auto-generated method stub
		System.out.println("신용카드로 "+price+"원 결제" );
		
	}

}
