package Map;

 
import java.util.LinkedHashMap;
import java.util.*;
 
//elements store on the basis of Key
//follow ascending  order
//does not allowed null
//duplicate not allowed
public class Tree_map {
 
	public static void main(String[] args) {
		Map<String, Integer> map=new TreeMap<String, Integer>();
		map.put("One", 1);
		map.put("Ten", 10);
		map.put("Nine", 9);
		map.put("Two", 2);
		map.put("Three", 3);
		map.put("Three", 8);
		map.put("Other", 10);
		map.put(null,null);
		map.put(null, 3);
		System.out.println(map);
		System.out.println(map.containsKey("nine"));
		System.out.println(map.containsValue(9));
		map.replace("Other", 10, 11);
		map.replace("Nine",90);
		System.out.println(map);
 
	}
 
}