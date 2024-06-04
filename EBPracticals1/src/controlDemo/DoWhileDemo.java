package controlDemo;

// Febinocci Series ( 0 1 1 2 3 5 8...)
public class DoWhileDemo {

	public static void main(String[] args) {
		
		int a,b,c;
		
		a=0;
		b=1;
		
		c=1;
		
		System.out.println(a + " ");
		System.out.println(b + " ");
		
		do
		{
			System.out.println(c + " ");
			a=b;
			b=c;
			c=a+b;
			
		}while(c<=50);
	}
}
