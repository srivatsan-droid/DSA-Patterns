import java.util.*;

public class ThreeSum {

    public List<List<Integer>> threeSumBrute(int[] nums) {
		for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                for (int k = j + 1; k < nums.length; k++) {

                    int sum = nums[i] + nums[j] + nums[k];

                    if (sum == 0) {
                        List<Integer> triplet = Arrays.asList(nums[i], nums[j], nums[k]);
                        Collections.sort(triplet); // avoid duplicates
                        set.add(triplet);
                    }
                }
            }
        }
        return new ArrayList<>(set);
    }

    public List<List<Integer>> threeSumOptimized(int nums[]) {
    	Arrays.sort(nums);
        List<List<Integer>> res = new ArrayList<>();
       int n = nums.length;
       for(int i = 0;i < n - 2;i++){
        int j = i+1,k = n - 1;
        
        if(i > 0 && nums[i] == nums[i-1]) continue;
        
        while(j < k){
            int sum = nums[i] + nums[j] + nums[k];
            if(sum == 0){
            res.add(Arrays.asList(nums[i],nums[j],nums[k]));
            j++;
            k--;
            while(j < k && nums[j] == nums[j-1]) j++;
            }else if(sum < 0) j++;
            else k--;

        }
       }

       return res;
    }

    public static void main(String[] args) {
        ThreeSum obj = new ThreeSum();
        int[] nums = {-1, 0, 1, 2, -1, -4};

        List<List<Integer>> result = obj.threeSumOptimized(nums);
        System.out.println(result);
    }
}