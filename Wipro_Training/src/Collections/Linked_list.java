package Collections;
import java.util.*;

public class Linked_list {
	
	

		public static void main(String[] args) {
			
			List<String> fruits=new LinkedList<String>();
			
			LinkedList<String>l=new LinkedList<String>();
			
			fruits.add("Apple");
			fruits.add("Orange");
			fruits.add("PineApple");
			fruits.add("Apple");//Duplicates Allowed
			fruits.add(null);
			
			System.out.println(fruits);
			
			System.out.println(fruits.indexOf("Orange"));
			System.out.println(fruits.contains("PineApple"));
			System.out.println(fruits.remove("Apple"));
			System.out.println(fruits.get(3));
			System.out.println(fruits.getFirst());

		}

	}