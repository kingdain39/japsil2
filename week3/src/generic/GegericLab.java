package generic;

import java.util.*;

public class GegericLab {
	
	public static <T> void copy(List<? extends T>src, List<? super T>dest) {
		for(T item:src) {
			dest.add(item);
		}
	}
	
	
	public static void main(String[] args) {
		//생산자 : 내용물을 꺼내서 제공할 리스트
		
		List<GoldenApple> goldenApples = new ArrayList<>();
		goldenApples.add(new GoldenApple());
		
		List<Apple> apples = new ArrayList<>();
		apples.add(new Apple());
		
		
		//소비자 역할 : 내용물을 전달받을 리스트
		List<Fruit> fruits = new ArrayList<>(); //과일바구니
		List<Object> objects = new ArrayList<>(); //잡동사니바구니
		
		System.out.println("복사 전 fruits: " +  fruits);
		System.out.println("복사전 objects: " + objects);
		System.out.println("------------------------------");
		
		//시나리오1 -> 황금사과 -> 과일바구니로 복사
		System.out.println("황금사과 -> 과일바구니로 복사");
		copy(goldenApples, fruits);
		System.out.println("복사 후 fruits: "+ fruits);
		System.out.println();

		
		//시나리오2 -> 사과를 Object에 복사, T는 Apple로 추론
		System.out.println("사과 -> Object로 복사");
		copy(apples, objects);
		System.out.println("복사 후 object: "+ objects);
		
		
		
		
	}

}
