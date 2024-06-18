package nestedclass;

class outer
{
	private String msg ="This is outer class";
	
	class inner
	{
		public void innerMessage()
		{
			System.out.println(msg);
		}
	}
}
public class NonStaticClassDemo {

	public static void main(String[] args) {
		
		outer oobj = new outer();
		
		//creating an object for inner class
		outer.inner iobj = oobj.new inner();
		iobj.innerMessage();
	}
}
