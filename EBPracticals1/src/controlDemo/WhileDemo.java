package controlDemo;


// while with if condition

public class WhileDemo {

	public static void main(String[] args) {
		
		int i,count=0;
		i=1;
		
		while(i<=20) // executes until the condition gets false.
		{
			if(i % 2 == 0)// checking the remainder is 0 or not
			{
				System.out.println("even: " + i);
				count++;
			}
			i++;
		}
		System.out.println("count of even numbers: " + count);
	}
}
