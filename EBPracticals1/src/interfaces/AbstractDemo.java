package interfaces;

abstract class a
{
	abstract void display();
	public void show() // concrete methods
	{
		System.out.println("this is show");	
	}
}
class b extends a
{
	@Override
	void display() {
		System.out.println("this is display");
	}
}
public class AbstractDemo {

	public static void main(String[] args) {
		
		b obj = new b();
		obj.display();
		obj.show();
	}

}
