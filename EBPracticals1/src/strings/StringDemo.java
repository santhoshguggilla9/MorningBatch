package strings;

public class StringDemo {

	public static void main(String[] args) {
		
		String str1 = "Hello";
		char ch;
		
		ch=str1.charAt(1);
		
		System.out.println("Character at the given index: " + ch);
		
		str1 = str1 + "world";
		
		System.out.println("Substring of str1: " + str1.substring(4));
		System.out.println("Substring of str1: " + str1.substring(4, 6));
		
		str1 = str1.concat(", How are you");
		System.out.println(str1);
		
		if(str1.contains("How")==true)
			System.out.println("value found");
		else
			System.out.println("value not found");
		
		if(str1.equals("How")==true)
			System.out.println("equal");
		else
			System.out.println("not equal");
		
		System.out.println("String in lower case: " + str1.toLowerCase());
		System.out.println("String in upper case: " + str1.toUpperCase());
		
		System.out.println("String in upper case: " + str1.trim());
		
		str1 = str1.replace(',', '!');
		System.out.println(str1);
		
		System.out.println(str1.lastIndexOf('r'));
		
		boolean status = str1.isEmpty(); 
		System.out.println(status);
	}
}
