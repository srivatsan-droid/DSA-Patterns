import java.util.*;
public class maxSlidingWindow {
	public static int[] maxSliding(int nums[],int k) {
		if (nums == null || nums.length == 0) return new int[0];
        
        int n = nums.length;
        int[] res = new int[n - k + 1];
        Deque<Integer> deque = new LinkedList<>(); // Stores indices

        for (int i = 0; i < n; i++) {
            // 1. Remove indices that are out of the current window range
            if (!deque.isEmpty() && deque.peekFirst() < i - k + 1) {
                deque.pollFirst();
            }

            // 2. Remove indices of smaller elements as they aren't useful anymore
            while (!deque.isEmpty() && nums[deque.peekLast()] < nums[i]) {
                deque.pollLast();
            }

            // 3. Add current element's index
            deque.offerLast(i);

            // 4. If window has reached size k, the front is our current max
            if (i >= k - 1) {
                res[i - k + 1] = nums[deque.peekFirst()];
            }
        }
        return res;
	}
	public static void main(String[] args) {
		int nums[] = {1,3,-1,-3,5,3,6,7};
		int k = 3;
		int ans[] = maxSliding(nums,k);
		for(int i = 0;i < ans.length;i++) {
			System.out.println(ans[i] + " ");
		}
	}
}