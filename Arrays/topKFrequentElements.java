import java.util.*;
public class topKFrequentElements {
	public static int[] topK(int nums[],int k) {
		HashMap<Integer,Integer> map = new HashMap<>();
		for(int i = 0;i < nums.length;i++) {
			map.put(nums[i],map.getOrDefault(nums[i],0)+1);
		}
		List<int[]> list = new ArrayList<>();
		for(Map.Entry<Integer,Integer> entry : map.entrySet()) {
			list.add(new int[]{entry.getValue(),entry.getKey()});
		}
		list.sort((a,b) -> Integer.compare(b[0],a[0]));
		int[] res = new int[k];
        for (int i = 0; i < k; i++) {
            res[i] = list.get(i)[1];
        }
        return res;
	}
	public static void main(String[] args) {
		int nums[] = {1,2,1,2,1,2,3,1,3,2};
		int k = 2;
		int ans[] = topK(nums,k);
		for(int i = 0;i < ans.length;i++) {
			System.out.println(ans[i] + " ");
		}
	}
}