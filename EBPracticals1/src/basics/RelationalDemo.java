package basics;

public class RelationalDemo {

	public static void main(String[] args) {
		
		int m1,m2,m3,total; 
		float avg;
		String res;
		
		m1=35;
		m2=99;
		m3=99;
		
		total = m1+m2+m3;
		avg = total / 3;
		
		boolean status;
		status = (m1==35);
		
		status = (m1>=35 || m2 >=35 || m3>=35);
		
		System.out.println(status);
	

	}

}
