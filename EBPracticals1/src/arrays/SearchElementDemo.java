package arrays;

import java.util.Scanner;

public class SearchElementDemo {

	public static void main(String[] args) {
		
		int nums [] = { 2, 6, 8 ,4, 8, 5 };
		int key,count=0;
		
		Scanner sc=new Scanner(System.in);;
		
		System.out.println("Enter the search value");
		key = sc.nextInt();
		
		for(int num : nums)
		{
			if(num==key)
			{
				count++;
			}
		}
		if(count>0)
			System.out.println(key + " value found");
		else
			System.out.println(key + " value not found");
		
		System.out.println("No of appearances of key: " +count);
		sc.close();
	}
}
