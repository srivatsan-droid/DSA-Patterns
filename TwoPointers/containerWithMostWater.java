public class containerWithMostWater {
	public static int maxAreaBrute(int height[]) {
		int area = 0;
		int maxArea = Integer.MIN_VALUE;
		for(int i = 0;i < height.length;i++) {
			for(int j = i + 1;j < height.length;j++) {
				if(i < j) {
					area = (j- i) * Math.min(height[i],height[j]);
				}
				maxArea = Math.max(maxArea,area);
			}
		}
		return maxArea;
	}
	public static int maxAreaOptimized(int height[]) {
		int left = 0,right = height.length-1;
		int width = 0;
		int maxArea = Integer.MIN_VALUE;
		while(left <= right) {
			int minHeight = Math.min(height[left],height[right]);
			width = right - left;
			int area = minHeight * width;
			maxArea = Math.max(maxArea,area);
			if(height[left] < height[right]) {
				left++;
			}
			else {
				right--;
			}
		}
		return maxArea;
	}
	public static void main(String[] args) {
		int height[] = {1,8,6,2,5,4,8,3,7};
		int ans = maxAreaOptimized(height);
		System.out.println(ans);
	}
}