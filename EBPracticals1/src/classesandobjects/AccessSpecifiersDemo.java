package classesandobjects;

class student
{
	private int age;
	public String sname;
	protected  int rno; 
	int sno;//default
	
}

public class AccessSpecifiersDemo {

	public static void main(String[] args) {

		student sobj = new student();
		//sobj.age=35;
		sobj.rno=35;
		sobj.sname="santhosh";

	}

}
