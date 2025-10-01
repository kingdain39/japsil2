public class CoffeeMaker {
	private Coffee coffee;
	

    public void setCoffee(Coffee coffee){
    	this.coffee = coffee;
    }

    public void makeCoffee(){
    	System.out.println(coffee.prepare());
    }

}

//얘는 커피만들기를 요청하는애임
//주문 받은 커피를 coffee필드에 저장하
