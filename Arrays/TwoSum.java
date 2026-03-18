import java.util.*;

public class TwoSum {
	public static int[] twoSumBrute(int nums[],int target) {
		int n = nums.length;
		for(int i = 0;i < n;i++) {
			for(int j = i + 1;j < n;j++) {
				if(nums[i] + nums[j] == target) {
					return new int[] {i,j};
				}
			}
		}
		return new int[] {-1,-1};
	}
	public static int[] twoSumOptimized(int nums[],int target) {
		int size = nums.length;
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i =0;i < size;i++) {
            int diff = target - nums[i];
            if(map.containsKey(diff)) {
                return new int[]{map.get(diff),i};
            }
            map.put(nums[i],i);
        }
        return new int[]{-1,-1};
	}
	public static void main(String[] args) {
		int nums[] = {3,2,4};
		int target = 6;
		int ans[] = twoSumOptimized(nums,target);
		for(int i = 0;i < ans.length;i++) {
			System.out.println(ans[i]);
		}
	}
}