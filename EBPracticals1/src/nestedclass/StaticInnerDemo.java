package nestedclass;

import nestedclass.outerr.inner;

class outerr
{
	private String msg ="This is outer class";
	
	//static inner class
	static class inner
	{
		public void innerMessage()
		{
			System.out.println("this is inner class message");
		}
	}
}
public class StaticInnerDemo {

	public static void main(String[] args) {
		
		//creating an object for inner class
		inner iobj = new inner();
		iobj.innerMessage();
	}

}
