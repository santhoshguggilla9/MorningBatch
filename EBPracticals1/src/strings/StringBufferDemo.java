package strings;

public class StringBufferDemo {

	public static void main(String[] args) {
		
		StringBuffer str1 = new StringBuffer("Hello");
				
		// append - merge the new string
		str1.append("world");
		System.out.println(str1);
		
		//insert - inserts the new string value to the existing string
		str1.insert(5, " Hi");
		System.out.println(str1);
		
		//System.out.println("String in reverse: " +str1.reverse());
		
		//deletion of the strgn at specified index nums
		str1.delete(6, 8);
		System.out.println(str1);
		
		//converts to String type
		String target = str1.toString();
		System.out.println(target);
		
		
	}

}
