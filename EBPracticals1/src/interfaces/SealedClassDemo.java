package interfaces;


sealed class sealedClass permits anotherClass,another
{
	public void show()
	{
		System.out.println("this is sealed class show");
	}
}
final class anotherClass extends sealedClass
{
	public void display()
	{
		System.out.println("it is another method");
	}
}
non-sealed class another extends sealedClass
{
	public void anotherDisplay()
	{
		System.out.println("it is another display");
	}
}
public class SealedClassDemo {

	public static void main(String[] args) {
		
		another an = new another();
		an.anotherDisplay();
		an.show();
		
		anotherClass an1 = new anotherClass();
		an1.display();
		an1.show();
	}
}
