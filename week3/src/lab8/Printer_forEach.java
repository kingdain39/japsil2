package lab8;

import java.util.ArrayList;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Printer_forEach implements PrettyPrinter {
	@Override
	public <E> void show(Set<E> set) {
		System.out.println("[Set 출력]");
		for(E e : set) {
			System.out.print(e+" ");
		}
		System.out.println();
		System.out.println();
	}

	@Override
	public <K, V> void show(Map<K, V> map) {
		// TODO Auto-generated method stub
		System.out.println("[Map 출력]");
		for(Entry<K, V> e : map.entrySet()) {
			System.out.println(e.getKey() +" : "+e.getValue());
		}
		
		System.out.println();
	}

	@Override
	public <E> void show(ArrayList<E> list) {
		// TODO Auto-generated method stub
		System.out.println("[ArrayList 출력]");
		for(E e : list) {
			System.out.println(e);
		}
		System.out.println();
		
	}





}
