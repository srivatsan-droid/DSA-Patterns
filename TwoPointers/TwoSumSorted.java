public class TwoSumSorted {
	/*
	Two Pointer Pattern : 
	Find the Cumulative Sum 
	Check if the sum is Equal to Target If Yes return the Left and right Pointers
	Else Move the Left Pointer Ahead
	Else Decrement the Right Pointer
	*/
	public static int[] twoSum(int[] numbers,int target) {
		int left = 0,right = numbers.length - 1;
		while(left <= right) {
			int sum = numbers[left] + numbers[right];
			if(sum == target) {
				return new int[] {left+1,right+1};
			}
			else if(sum < target) {
				left++;
			}
			else {
				right--;
			}
		}
		//No Target can be formed
		return new int[]{-1,-1};
	}
	public static void main(String[] args) {
		int nums[] = {2,7,11,15};
		int target = 9;
		int ans[] = twoSum(nums,target);
		for(int i = 0;i < ans.length;i++) {
			System.out.println("The Target can be Formed by : " + ans[i]);
		}
	}
}