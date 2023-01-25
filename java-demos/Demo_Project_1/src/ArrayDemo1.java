
public class ArrayDemo1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] nums = new int[5];		//array declaration & creation
		
		nums[0] = 10;
		nums[1] = 20;
		nums[2] = 30;
		nums[3] = 40;
		nums[4] = 50;
		
		System.out.println("array elements are : ");
		
//		for(int i=0; i<nums.length; i++) {
//			System.out.println(nums[i]);
//		}
		
		for(int value: nums) {
			System.out.println(value);
		}

	}

}
