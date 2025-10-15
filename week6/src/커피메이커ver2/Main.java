package 커피메이커ver2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

import javax.swing.plaf.synth.SynthOptionPaneUI;

import Machine.DripCoffeeMachine;
import Machine.EspressoMachine;
import Machine.IceMaker;
import Machine.MilkFrother;
import Machine.WaterBoiler;
import Pay.Cash;
import Pay.CreditCard;
import Pay.KakaoPay;
import Pay.PaymentMethod;

public class Main {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringTokenizer st;
		EspressoMachine  espressoMachine = new EspressoMachine();
		DripCoffeeMachine dripCoffeeMachine = new DripCoffeeMachine();
		MilkFrother milkFrother = new MilkFrother();
		CoffeeMaker coffeeMaker = new CoffeeMaker();
		WaterBoiler waterBoiler = new WaterBoiler();
		IceMaker iceMaker = new IceMaker();
		PaymentMethod payMethod ;
		Menu menu = new Menu();
		CoffeeFactory coffeeFactory = new CoffeeFactory(espressoMachine,milkFrother,waterBoiler,iceMaker);
		Manager manager = new Manager(coffeeMaker, menu, coffeeFactory);
		
		String[] orderList;
		PaymentMethod currentPayment;
		
		
		
		System.out.print("결제 방식을 선택해주세요. 1.신용카드  2.카카오페이  3.현금");
		int payment = Integer.parseInt(br.readLine());
		switch(payment) {
			case 1:
				currentPayment = new CreditCard();
				break;
			case 2:
				currentPayment = new KakaoPay();
				break;
			case 3:
				System.out.print("받은 돈 입력: ");
				currentPayment = new Cash(Integer.parseInt(br.readLine()));
				break;
			default :
				System.out.println("나가주세요");
				System.out.println("주문을 종료합니다.");
				return;
		
		}
		
		
		System.out.println("음료 주문 양식 : [메뉴명] [Hot,Ice] [우유옵션(우유음료인경우)]");
		System.out.print("인원 수를 입력하세요 : ");
		
		for(int i=0; i<Integer.parseInt(br.readLine());i++){
			String order = br.readLine();
			orderList = order.split(" ");
			
			String orderName = orderList[0];
            String temp = orderList.length > 1 ? orderList[1] : null;
            String liqOption = orderList.length > 2 ? orderList[2] : null;

            System.out.println("\n--- " + orderName + " 주문 (" + currentPayment.getClass().getSimpleName() + ") ---");
            
            
            manager.getOrder(currentPayment, orderName, temp, liqOption);
			
		}
		



		
	}
}
