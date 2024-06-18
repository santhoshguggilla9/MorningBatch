package inheritances;

interface animals // Super Class
{
	public void eat();
	
}
interface dogs // Super Class
{
	public void bark();
	
}
class puppys implements animals, dogs  // Sub Class - 
{
	public void weep()
	{
		System.out.println("puppy is weeping");
	}
	@Override
	public void bark() {
		System.out.println("dogs are barking");
	}
	@Override
	public void eat() {
		System.out.println("animals are eating");
	}
}

public class MultipleInheritanceExample {

	public static void main(String[] args) {
		
		puppys p1 = new puppys();
		p1.bark();
		p1.eat();
		p1.weep();

	}

}
