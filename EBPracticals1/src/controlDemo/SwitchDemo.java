package controlDemo;

public class SwitchDemo {

	public static void main(String args[])
	{
	
		String type_fruit;
		int f_code=6; // 1-3 are veg || 4-8 are fruits
		
		
		type_fruit = switch(f_code)
				{
				case 1,2,3 -> "vegetables";
				case 4,5,6,7,8 -> "fruits";
				
				default -> "Invalid type_fruit code";
				};
				
				System.out.println("fruit you selected: " + type_fruit);
	}
}