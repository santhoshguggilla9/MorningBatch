package inheritances;

class bank
{
	bank()
	{
		System.out.println("Bank Constructor");
	}
	public void showBank() {
		System.out.println("it is bank method");
	}
}
class sbi extends bank
{
	sbi()
	{
		System.out.println("it is sbi constructor");
	}
	public void showsbi() {
		System.out.println("it is sbi method");
	}
}
public class ConstructorInheritanceExample {

	public static void main(String[] args) {
		
		sbi s = new sbi();
		s.showBank();
		s.showsbi();
	}

}
