package arrays;


class sample
{
	private int age;
	private String sname;
	
	sample(int a,String s)
	{
		age=a;
		sname=s;
	}
	public void showAge()
	{
		System.out.println("sname: " + sname + "||" +"age: " +age);
	}
	
}
public class ArrayofObjectsDemo {

	public static void main(String[] args) {
	
		//array of objects
		sample [] sam = new sample[3];
		
		sam[0] = new sample(10,"santhosh");
		sam[1] = new sample(20,"ram");
		sam[2] = new sample(30,"raj");
		
//		sam[0].showAge();
//		sam[1].showAge();
//		sam[2].showAge();
		
		
		//enhanced for
		for(sample s : sam)
		{
			s.showAge();
		}
	}
}
