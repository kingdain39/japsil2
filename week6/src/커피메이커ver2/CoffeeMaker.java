package 커피메이커ver2;

import Recipe.Coffee;

//얘는 준비된 커피 재료들을 섞는 애임. 팩토리가 생성한 커피재료세트를 받아서 섞는 일을 함. 
public class CoffeeMaker {

    public void makeCoffee(Coffee coffee){
    	System.out.println(coffee.prepare());
    	
    }

}


