package arrays;

import java.util.Calendar;

public class ArrayDemo {

	public static void main(String[] args) {

			
		String [] names;
		names = new String[5]; // single -dimentional array
		
		names[0] = "apple";
		names[1] = "banana";
		names[2] = "mango";
		names[3] = "pine";
		names[4] = "kiwi";
		
		//using for loop
		long startTime = Calendar.getInstance().getTimeInMillis(); 
		for(int i=0;i<names.length;i++)
		{
			System.out.println("array value: " + names[i]);
		}
		long endTime = Calendar.getInstance().getTimeInMillis(); 
		System.out.println("For each loop :: " + (endTime - startTime) + " ms"); 
		
		//using for-each loop or enhanced for loop
		startTime = Calendar.getInstance().getTimeInMillis(); 
		for(String name : names)
		{
			System.out.println(name);
		}
		endTime = Calendar.getInstance().getTimeInMillis(); 
		System.out.println("For each loop :: " + (endTime - startTime) + " ms"); 
	}
}
