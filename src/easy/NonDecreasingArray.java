package easy;


//1
public class NonDecreasingArray {

	public void demo() {
		int[] n = { 1, 5, 3, 4, 2, 3, 6, 4, 6, 9 };

		n= new int[] {1, 2, 3, 4,2,1};

		System.out.println("\n ====== NonDecreasingArray ======= \n");

		System.out.println(checkPossibility(n));
	}
	
	
	private boolean checkPossibility(int nums[]) {
	
		int count = 0;
		
		for(int i = 1; i < nums.length; i++) {
			
			if(nums[i-1] > nums[i]) {
				count++;
				
				if(i-2 < 0 || nums[i-2] <= nums[i]) nums[i-1] = nums[i];
				else 
					nums[i] = nums[i-1];
			}
			
		}
		
		return count < 2;
	}
	
	
}
