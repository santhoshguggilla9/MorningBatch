package exceptions;

public class ExceptionDemo {

	public static void main(String[] args) {
		
		int x,y;
		
		// try block contains all the executable code
		try
		{
			x=100;
			y=0;
			
			int z= x/y;
			
			String str = null;
			System.out.println(str.length());
			
			System.out.println(z);
		}
		// any type of exception
		catch(Exception e)
		{
			System.out.println("Error: " +e);
		}
		// executing the finally 
		finally
		{
			System.out.println("finally block: execute regardless error occurance");
		}
		System.out.println("this is the rest of code");
	}

}
