package lab3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		list1.add("abc");
		list1.add("bcd");
		//list1.add(123);  -> 오류남
		list2.add(123);
		list2.add(234);
		//list2.add("adf");  -> 오류남
		
		// -------------------------------------
		 Box<String> box1 = new Box<String>();
		    Box<강아지> box2 = new Box<강아지>();
		    Box<뱀> box3 = new Box<뱀>();
		    Box<치와와> box4 = new Box<치와와>();
		    Box<자동차> box5 = new Box<자동차>();
		    Box<동물> 동물농장 = new Box<동물>();
		    
		    box2.add(new 강아지());
		    box3.add(new 뱀());
		    box2.add(new 치와와());
		    box4.add(new 치와와());
		    
		    
		    ArrayList<강아지> lst1 = new ArrayList<강아지>();
		    lst1.add(new 강아지());
		    lst1.add(new 치와와()); //들어갈 때 치와와는 강아지로 자동박싱되는 건가????
		    
		    ArrayList<치와와> lst2 = new ArrayList<치와와>();
		    lst2.add(new 치와와());
		    
		    
		    box2.put_super(lst1); //강아지 동물 가능
		    box2.put_sub(lst2); //치와와 가능
		    
		

	}

}
