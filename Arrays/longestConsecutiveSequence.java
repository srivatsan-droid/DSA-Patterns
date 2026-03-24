import java.util.*;
public class longestConsecutiveSequence {
	public static int longestSequenceBrute(int nums[]) {
		int n = nums.length;
		int count = 0;
		for(int i = 0;i < n;i++) {
			for(int j = i + 1;j < n;j++) {
				if(nums[i] < nums[j]) {
					count++;
				}
			}
		}
		return count;
	} 
	public static int longestSequenceOpti(int nums[]) {
		int size = nums.length;
		if(nums.length == 0)
			return 0;
		Set<Integer> set = new HashSet<>();
		for(int num : nums) {
			set.add(num);
		}
		int maxStreak = 0;
		for(int num : set) {
			if(!set.contains(num - 1)) {
				int currNum = num;
				int count = 1;
				while(set.contains(currNum + 1)) {
					currNum++;
					count++;
				}
				maxStreak = Math.max(maxStreak,count);
			}
		}
		return maxStreak;
	}
	public static void main(String[] args) {
		int nums[] = {0,3,7,2,5,8,4,6,0,1};
		int ans = longestSequenceOpti(nums);
		System.out.println(ans);
	}
}