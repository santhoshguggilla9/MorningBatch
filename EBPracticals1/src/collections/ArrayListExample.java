package collections;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

public class ArrayListExample {

	public static void main(String[] args) {
		
//		// creating the list of numbers
//		List<Integer> nums = new ArrayList<Integer>();
//		
//		nums.add(100);
//		nums.add(200);
//		nums.add(300);
//		nums.add(400);
//		nums.add(500);
//		
//		System.out.println(nums);
//		
		// creating the list of names		
		List<String> fruits = new LinkedList<String>();
		
		fruits.add("mango");
		fruits.add("apple");
		fruits.add("kiwi");
		fruits.add("orange");
		fruits.add("banana");
		//fruits.add(null);
		
		//	get the value based on index value
		System.out.println("element at the index 3: " +fruits.get(3));
		
		fruits.remove(2);
		System.out.println("Fruits are: " +fruits);
		
		fruits.set(3, "mango");
		System.out.println("Fruits are: " +fruits);
		
		System.out.println("the size of the list: " +fruits.size());
		
		for(String fruit : fruits)
		{
			System.out.println(fruit);
		}
		// allows the duplicate values
		fruits.add("apple");
		
		Collections.sort(fruits);
		System.out.println(fruits);
	}
}
