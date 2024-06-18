package exceptions;

class AgeNotElegibleException extends Exception
{
	AgeNotElegibleException(String msg){
		super(msg);
	}
}
public class CustomException {

	public static void checkAge(int age) throws AgeNotElegibleException
	{
		if(age<18)
			// throwing the error explicitly
			throw new AgeNotElegibleException("Age is not elegible");
		else
			System.out.println("age is elegible");
	}
	
	public static void main(String[] args) {
	
		try {
			checkAge(12);
		}
		catch(AgeNotElegibleException e) {
			System.out.println(e);
		}
	}
}
