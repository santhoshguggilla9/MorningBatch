package arrays;

public class SumOfElementsDemo {

	public static void main(String[] args) {
		
		int nums [] = { 2, 6, 8 ,4, 8, 5 };
		int sum=0;
		
		//sum of elements
		for(int num : nums)
		{
			sum = sum + num;
		}
		System.out.println("Sum of elements: " +sum);
		
		//printing numbers in reverse order
		for(int i=nums.length-1; i>=0;i--)
		{
			System.out.println(nums[i]);
		}
	}
}
