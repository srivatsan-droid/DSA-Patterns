public class productOfArrExceptSelf {
	public static int[] product(int nums[]) {
		int ans[] = new int[nums.length];
		for(int i = 0;i < nums.length;i++) {
			int product = 1;
			for(int j = 0;j < nums.length;j++) {
				if(i != j) {
					product *= nums[j];
				}
				ans[i] = product;
			}
		}
		return ans;
	}
	public static int[] productOpti(int nums[]) {
		int n = nums.length;
		int ans[] = new int[n];
		ans[0] = 1;
		for(int i = 1;i < n;i++) {
			ans[i] = ans[i-1] * nums[i-1];
		}
		int right = 1;
		for(int i = n - 1;i >= 0;i--) {
			ans[i] = ans[i] * right;
			right *= nums[i];
		}
		return ans;
	}
	public static void main(String[] args) {
		int nums[] = {1,2,3,4};
		int ans[] = productOpti(nums);
		for(int i = 0;i < ans.length;i++) {
			System.out.println(ans[i] + " ");
		}
	}
}