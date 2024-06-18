package interfaces;

interface RateOfInterest
{
	public void roi(String bname);
}
class sbi implements RateOfInterest
{
	public void roi(String bname) {
		System.out.println(bname + " Rate of interst is 10.5%");
	}
}
class axis implements RateOfInterest
{
	public void roi(String bname) {
		System.out.println(bname + " Rate of interst is 11.0%");
	}
}
class icici implements RateOfInterest
{
	public void roi(String bname) {
		System.out.println(bname + " Rate of interst is 12.0%");
	}
}
public class BankInterface {

	public static void main(String[] args) {
		
		sbi sobj = new sbi();
		axis aobj = new axis();
		icici iobj = new icici();
		
		sobj.roi("SBI");
		aobj.roi("AXIS");
		iobj.roi("ICICI");

	}

}
