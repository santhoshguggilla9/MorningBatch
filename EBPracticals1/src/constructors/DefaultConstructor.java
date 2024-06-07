package constructors;

class college
{
	private int coll_code;
	private String sname,coll_name;
	
//	//dummy constructor
//	college() {};	
	
	//default constructor
	college()
	{
		coll_code=1001;
		System.out.println("code: " +coll_code);
	}
	
	// constructor with Parameters : parameterised
	college(String name, String cn)
	{
		sname=name;
		coll_name=cn;
		System.out.println("sname: " +sname + " coll name: " +coll_name);
	}
	public void display()
	{
		System.out.println("it is a display");
	}
}
public class DefaultConstructor {

	public static void main(String[] args) {
		
		college s1 = new college();
		college s2 =new college("santhosh", "BITS");
		s2.display();
		s1.display();
	}
}
