package solution.leetcode;

import java.util.Arrays;

public class MaximumSumWithExactlyKElements {
    public static void main(String[] args) {
        MaximumSumWithExactlyKElements ms = new MaximumSumWithExactlyKElements();
        System.out.println(ms.maximizeSum(new int[]{1, 2, 3, 4, 5}, 3)); // 18
        System.out.println(ms.maximizeSum(new int[]{5, 5, 5}, 2)); // 11
        System.out.println(ms.maximizeSum(new int[]{1, 1, 1}, 3)); // 6
    }
    public int maximizeSum(int[] nums, int k) {
        int max = Arrays.stream(nums).max().orElse(0);
        return (k*max) + ((k*(k-1))/2);
    }
}
