import java.util.HashSet;

public class ContainsDuplicate {
    public static boolean containsDuplicateBrute(int nums[]) {
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    // Optimized Solution
    public static boolean containsDuplicateOptimized(int nums[]) {
        HashSet<Integer> set = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
            if (set.contains(nums[i])) {
                return true;
            }
            set.add(nums[i]);
        }
        return false;
    }

    public static void main(String[] args) {
        int nums[] = { 1, 2, 3, 1 };
        boolean ans = containsDuplicateBrute(nums);
        System.out.println(ans);
        boolean ans2 = containsDuplicateOptimized(nums);
        System.out.println(ans2);
    }
}