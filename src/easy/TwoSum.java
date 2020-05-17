package easy;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {

	public void demo() {

		int[] arr = { 2, 7, 11, 15 };

		System.out.println(Arrays.toString(twoSum(arr, 9)));
		
		
	}

	private int[] twoSum(int []nums, int target) {
		
		Map<Integer, Integer> map = new HashMap<>();
	

		for(int i = 0; i < nums.length; i++) {
			if(map.containsKey(target - nums[i])) {
				return new int[] {i, map.get(target - nums[i])};
			}
			else {
				map.put(nums[i], i);
			}
		}
		
		return new int[] {};
	}

}
