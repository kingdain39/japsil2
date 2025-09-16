package lab1;

import java.util.ArrayList;

public class MyDice <T>{
	ArrayList <T> value = new ArrayList<T>();
	T result;
	
	public MyDice(T t){
		result = t;
	}
	
	public void setDiceToColor() {
		System.out.println("색깔을 무지개색으로 세팅합니다.");
		String colors = "빨 주 노 초 파 남 보";
		String [] ar = colors.split(" ");
		for(String s : ar) {
			value.add((T)s);
		}
	}
	
	public void setDiceToNumber(int size) {
		System.out.printf("Integer %d개로 세팅합니다\n",size);
		for(Integer i=0; i<size; i++) {
			Integer num = i+1;
			value.add((T)num);
			// 왜 안되는걸까 ,,, value.add((T)(i+1));
		}
	}
	
	public <T> void 구르기() {
		result = value.get((int)(Math.random()*10000)%value.size()); 
	}
}
