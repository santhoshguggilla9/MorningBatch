package readValues;

import java.util.Scanner;

public class ScannerDemo {

	public static void main(String[] args) {
		
		int age;
		String sname;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter your name");
		sname = sc.nextLine();
		
		System.out.println("Enter your age");
		age = sc.nextInt();
		
		System.out.println(sname);
		System.out.println(age);
		
		sc.close();
	}
}
