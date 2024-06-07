package arrays;

public class MultiDimenDemo {

	public static void main(String[] args) {
		
		//int [][] nums = new int [2][2];
		
		int [][] nums = {
							{10,20},
							{30,40}
						};
		
//		nums[0][0] =10;
//		nums[0][1] =20;
//		nums[1][0] =30;
//		nums[1][1] =40;
		
		System.out.println(nums[1][1]);
		
		for(int i=0;i<nums.length;i++)
		{
			for(int j=0;j<nums.length;j++)
			{
				System.out.println("array value: " + nums[i][j]);
			}
		}
	}

}
