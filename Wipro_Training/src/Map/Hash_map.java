package Map;
import java.util.*;

public class Hash_map {

	public static void main(String[] args) {
		Map<String, Integer> map=new HashMap<String, Integer>();
		map.put("One" , 1);
		map.put("Ten" , 10);
		map.put("Two" , 2);
		map.put("Five" , 1);
		map.put("Four" , 4);
		map.put(null, null);
		System.out.println(map);
		System.out.println(map.containsKey("Two"));
	
		// TODO Auto-generated method stub

	}

}
