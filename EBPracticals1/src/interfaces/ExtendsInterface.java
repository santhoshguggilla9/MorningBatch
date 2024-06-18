package interfaces;

interface human
{
	public void eat();
	public void walk();
}
interface male extends human // HAS -A RELATION SHIP
{
	public void sleep();
}
class santhosh implements male // IS - A RELATION SHIP
{
	public void eat() {
		System.out.println("He is eating");
		
	}
	public void walk() {
		System.out.println("He is walking");
		
	}
	public void sleep() {
		System.out.println("He is sleeping");
		
	}
}
public class ExtendsInterface {

	public static void main(String[] args) {
		
		male s = new santhosh(); // allocation the memory for class using interface reference
		
		s.eat();
		s.walk();
		s.sleep();

	}

}
