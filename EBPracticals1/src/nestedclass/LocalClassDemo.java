package nestedclass;

class outerClass
{
	public void display()
	{
		//creating a local class
		class localClass
		{
			public void message()
			{
				System.out.println("it is local class method");
			}
		}
		//creating an object for the local class
		localClass lobj = new localClass();
		lobj.message();
		
		System.out.println("this is outer class display method");
	}
}
public class LocalClassDemo {

	public static void main(String[] args) {
		
		outerClass oobj = new outerClass();
		oobj.display();
	}

}
