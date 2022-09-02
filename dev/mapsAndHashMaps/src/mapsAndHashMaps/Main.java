package mapsAndHashMaps;
import java.util.HashMap;
import java.util.TreeMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Main {
	public static void main(String[] args) {
		
		/*
		 * a map contains key-value pairs
		 * HashMap: unordered
		 * TreeMap: ordered (sorted). all types must be the same! (cannot sort String with Int)
		 * LinkedHashMap: like a list, maintains order of added elements (does not sort them)
		 * */
		
		Map m = new HashMap();
		m.put("tim", 5);
		m.put("joe", "x");
		m.put(11, 999);
		
		m.containsValue("x");
		m.containsKey("tim");
		
		m.values();
		
		m.get("key"); // gets value of key
		
		System.out.println(m);
	}
}
