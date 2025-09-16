package generic;

class Fruit {
	@Override
	public String toString() {
		return "과일";
		
	}
}

class Apple extends Fruit{
	@Override
	public String toString() {
		return "사과";
	}
}

class GoldenApple extends Fruit{
	@Override
	public String toString() {
		return "황금사과";
	}
}



