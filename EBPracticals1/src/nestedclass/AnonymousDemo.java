package nestedclass;

class anonymous
{
	int age=50;
	
	public void showAge()
	{
		System.out.println("age: " +age);
	}
	public void message() {};
	
}

public class AnonymousDemo {

	public static void main(String[] args) {
		
		anonymous aobj = new anonymous()//anonymous class
						{
								public void showAge()
								{
									System.out.println("age: " +age);
								}	
								public void message()
								{
									System.out.println("this is a new method to the anon class");
								}
						};
						aobj.showAge();
						aobj.message();
	}

}
