package nestedclass;

class thisExample
{
	private double sal;
	private String sname;
	
	public void setVal(double sal, String sname)
	{
		this.sal=sal;
		this.sname=sname;
	}
	public void showVal()
	{
		System.out.println("salary: " +sal+ "||" + "sname: " +sname);
	}
}

public class ThisDemo {

	public static void main(String[] args) {
		
		thisExample tobj = new thisExample();
		
		tobj.setVal(12000.00, "santhosh");
		tobj.showVal();
	}

}
