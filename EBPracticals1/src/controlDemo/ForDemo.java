package controlDemo;

// Number in reverse 
public class ForDemo {

	public static void main(String[] args) {
		
		int r,rev=0,n;
		
		n=153;
		
		for(; n>0 ;n/=10)
		{
			r=n%10;
			rev = rev*10+r;
		}
		System.out.println("Number in reverse: " +rev);
	}

}
