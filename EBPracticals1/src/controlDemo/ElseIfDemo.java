package controlDemo;

public class ElseIfDemo {

	public static void main(String[] args) {
		
		int i,j,k;
		
		i=60;
		j=80;
		k=20;
		
		//else if ladder
		if(i>j && i>k)
		System.out.println(i + " is big");
		
		else if(j>i && j>k)
		System.out.println(j + " is big");
		
		else if(k>i && k>j)
		System.out.println(k + " is big");
		
		else
		System.out.println("all are equal");
	}
}
