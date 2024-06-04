package readValues;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class BufferedReaderDemo {

	public static void main(String[] args) throws IOException {
		
		String sname;
		int age;
		
		InputStreamReader isr = new InputStreamReader(System.in);
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter Student name");
		sname = br.readLine();
		
		System.out.println("Enter age");
		age= Integer.parseInt(br.readLine());
		
		System.out.println("the value entered: " +sname);
		System.out.println("age is " + age);
	}
}
