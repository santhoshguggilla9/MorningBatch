package inheritances;

class computer
{
	private int gen;
	private String cname;
	
	public void readVal(int gen, String cname)
	{
		this.gen=gen;
		this.cname=cname;
	}
	public void showVal()
	{
		System.out.println("Generation: " +gen + " " + "Computer name: " + cname);
	}
}
class laptop extends computer // IS - A RELATION SHIP
{
	String speed= "4.8 ghz";
	
	public void config()
	{
		System.out.println("laptop speed: " + speed);
	}
}
public class SingleExample {

	public static void main(String[] args) {
	
		laptop l1 = new laptop();
		
		l1.readVal(3, "Intel");
		l1.config();
		l1.showVal();
	}

}
