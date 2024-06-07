package arrays;

public class JaggedArrayDemo {

	public static void main(String[] args) {
		
		int [][] jarr = new int[3][];
		
		jarr[0] = new int[3];
		jarr[1] = new int[4];
		jarr[2] = new int[1];
		
		jarr[0][0]=10;
		jarr[0][1]=20;
		jarr[0][2]=30;
		
		jarr[1][0]=10;
		jarr[1][1]=20;
		jarr[1][2]=30;
		jarr[1][3]=40;
		
		jarr[2][0]= 50;
		
		System.out.println(jarr[1][3]);
	}
}



















