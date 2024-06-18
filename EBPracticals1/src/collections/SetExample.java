package collections;

import java.util.HashSet;
import java.util.Set;

public class SetExample {

	public static void main(String[] args) {
		
		Set<String> names = new HashSet<String>();
	
		names.add("santhosh");
		names.add("ram");
		names.add("ravi");
		names.add("varun");
		names.add("kiran");
		//names.add("kiran");
		names.add(null);
		
		System.out.println(names);
		
		for(String name : names) {
			System.out.println(name);
		}
	}

}
