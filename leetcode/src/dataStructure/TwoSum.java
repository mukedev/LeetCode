package dataStructure;

// 两个整数元素等于 target
public class TwoSum {

	public static int[] twosum(int[] nums, int target) {
		int[] index = new int[2];

		for (int i = 0; i < nums.length - 1; i++) {
			for (int j = i+1; j < nums.length; j++) {
				if (nums[i] + nums[j] == target) {
					index[0] = i;
					index[1] = j;
					return index;
				}
			}
		}
		return null;
	}
	
	public static void main(String[] args) {
		int[] nums = {1,2,3,4,5};
		for (int i : twosum(nums, 6)) {
			System.out.println(i);
		};
	}
}
