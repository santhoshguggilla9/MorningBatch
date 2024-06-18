package interfaces;

interface sample
{
	public void show();
}
class sam implements sample
{
	public void show() {
			System.out.println("this is my show method");
	}
}
public class SampleInterfaceDemo {

	public static void main(String[] args) {
		
		sam s = new sam();
		s.show();
	}
}
