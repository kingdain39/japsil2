package 커피메이커ver2;

import java.util.HashMap;
import java.util.Map;

public class Menu {
 private Map<String, Integer> items;

 public Menu() {
     items = new HashMap<>();
     items.put("Latte", 5000);
     items.put("Americano", 4000);
     items.put("Espresso", 3500);
 }

 public int getPrice(String coffeeName) {
     return items.get(coffeeName);
 }
}