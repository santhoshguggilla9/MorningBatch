package exceptions;

public class ThrowExample {

	public static void checkAge(int age)
	{
		if(age<18)
			// throwing the error explicitly
			throw new ArithmeticException("Age is not elegible");
		else
			System.out.println("age is elegible");
	}
	public static void main(String[] args) {
		
		checkAge(17);

	}

}
