package staticDemo;

class drive
{
	static int x;
	int y =20;
	
	//static block
	static
	{
		x=50;
	}
	public static void design()
	{
		System.out.println("x value is " + x);
	}
} 
public class StaticMethod {

	public static void main(String[] args) {
		
		drive.design();
	}

}
