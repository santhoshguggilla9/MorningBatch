package inheritances;

class animal
{
	public void eat()
	{
		System.out.println("animal is eating");
	}
}
class dog extends animal
{
	public void bark()
	{
		System.out.println("dog is barking");
	}
}
class puppy extends dog
{
	public void weep()
	{
		System.out.println("puupy is weeping");
	}
}
public class MultilevelExample {

	public static void main(String[] args) {
		
		puppy p1 = new puppy();
		p1.eat();
		p1.bark();
		p1.weep();

	}

}
