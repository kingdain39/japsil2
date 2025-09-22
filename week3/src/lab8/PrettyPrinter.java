package lab8;

import java.util.ArrayList;
import java.util.Map;
import java.util.Set;

public interface PrettyPrinter {
	public <E> void show(Set<E> set);
	public <K,V> void  show(Map<K,V> map);
	public <E> void show(ArrayList<E> list);

}
