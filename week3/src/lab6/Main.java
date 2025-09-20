package lab6;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class Main {

	public static <E> void show(Set <E> s) {
		
		/*for(E e : s)
			System.out.print(e + " ");
		System.out.println("\n-----------------------------");
		*/
		Iterator <E> it = s.iterator();
		while(it.hasNext()) 
			System.out.print(it.next()+" ")	;
		System.out.println("\n-----------------------------");
			
		
		
}
	
	public static void main(String[] args) {
		System.out.println("Set Lab");
		
		Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4,5));
		Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6,7));
		Set<Integer> set3 = new HashSet<>(Arrays.asList(5,6,7,8,9));
		Set<Integer> set4 = new HashSet<>(Arrays.asList(8,9,10,11,12));
		Set<Integer> set5 = new HashSet<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12));
		
		set1.addAll(set2);
		set2.retainAll(set3);
		set3.removeAll(set4);
		set4.removeAll(set3);
		
		
		
		
		show(set1);
		show(set2);
		show(set3);
		show(set4);
		show(set5);
		System.out.println("set4는 set5의 부분집합? : "+set5.containsAll(set4));
		
	}
	
}
