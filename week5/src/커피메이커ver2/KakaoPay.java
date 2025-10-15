package 커피메이커ver2;

public class KakaoPay implements PaymentMethod {

	@Override
	public void pay(int price) {
		// TODO Auto-generated method stub
		System.out.println("카카오 페이로 "+price+"원 결제" );
		
	}

}
