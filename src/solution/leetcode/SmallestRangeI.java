package solution.leetcode;

import java.util.Arrays;

public class SmallestRangeI {
    public static void main(String[] args) {
        SmallestRangeI solution = new SmallestRangeI();
        System.out.println(solution.smallestRangeI(new int[]{1}, 0)); // 0
        System.out.println(solution.smallestRangeI(new int[]{0,10}, 2)); // 6
        System.out.println(solution.smallestRangeI(new int[]{1,3,6}, 3)); // 0
    }
    public int smallestRangeI(int[] nums, int k) {
        if(nums.length<2) return 0;
        int min = Arrays.stream(nums).min().getAsInt();
        int max = Arrays.stream(nums).max().getAsInt();
        int sum = max - min - k - k;
        return Math.max(sum, 0);
    }
}
