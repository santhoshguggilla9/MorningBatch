package inheritances;

class parent
{
	private int acno;
	private String acname;
	
	public void setval(int x, String a)
	{
		acno=x;
		acname=a;
		System.out.println("Parent: acc no: " + acno + " accname: " +acname);
		System.out.println("--------------------------------------");
	}
}
class child extends parent
{
	private int acno;
	private String acname;
	
	public void setval(int x, String a)
	{
		super.setval(x,a);
		acno=x;
		acname=a;
		System.out.println("Child: acc no: " + acno + " accname: " +acname);
		System.out.println("--------------------------------------");
	}
}
public class OverridingExample {

	public static void main(String[] args) {
		
		child ch = new child();
		ch.setval(101, "santhosh");
	}
}
