package controlDemo;

import java.util.Scanner;

public class WhileSwitchDemo {

	public static void main(String[] args) {
		
		
		int choice,i,j,res;
		char option ='Y';
		
		i=20;
		j=30;
		Scanner sc = new Scanner(System.in);
		
		while(option == 'Y' ||option == 'y')
		{
		
			System.out.println("...........MENU..........");
			System.out.println("1. Addition");
			System.out.println("2. Subtraction");
			System.out.println("3. Mulitiplication");
			System.out.println("4. EXIT");
			System.out.println(".........................");
		
			System.out.println("Enter your choice");
			choice = sc.nextInt();
						
			switch(choice)
			{
				case 1:
					res=i+j;
					System.out.println("Add: " + res);
					break;
					
				case 2:
					res=i-j;
					System.out.println("Sub: " + res);
					break;
					
				case 3:
					res=i*j;
					System.out.println("Mul: " + res);
					break;
					
				case 4:
					break;
					
				default:
					System.out.println("Invalid voice");
			}
			System.out.println("You want to continue Y/N");
			option = sc.next().charAt(0); // reading a character
		}
		sc.close();
	}
	
}
