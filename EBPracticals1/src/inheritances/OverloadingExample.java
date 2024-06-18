package inheritances;

class main
{
	private int acno;
	private String acname;
	
	public void setval()
	{
		acno=101;
		acname="santhosh";
	}
	public void setval(int x)
	{
		acno=x;
		acname="robin";
	}
	public void setval(int x, String a)
	{
		acno=x;
		acname=a;
	}
	public void show()
	{
		System.out.println("acc no: " + acno + " accname: " +acname);
		System.out.println("--------------------------------------");
	}
}
public class OverloadingExample {

	public static void main(String[] args) {
	
		main m = new main();
		
		m.setval();
		m.show();
		
		m.setval(102);
		m.show();
		
		m.setval(20, "ram");
		m.show();
	}
}
