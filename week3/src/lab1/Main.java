package lab1;

import java.util.Scanner;

public class Main {
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		MyDice dice = null;
		String s = "";
		int num = 0; 
		 System.out.println("주사위 타입을 선택 하세요 : 1.색깔 2.숫자");		
		 System.out.println("선택: ");
		 int type = sc.nextInt();
		 
		 sc.nextLine();
		 System.out.print("값을 입력합니다");
		 if(type == 1) {
			 dice = new MyDice<String>("");
			 dice.setDiceToColor();
		 }
		 
		 if(type == 2) {
			 dice = new MyDice<Integer>(0);
			 dice.setDiceToNumber(10);
		 }
		 
		 System.out.println(dice.value);
		 dice.구르기();
		 System.out.println("랜덤하게 고른 값은 [" + dice.result + "] 입니다");

	}

}
