package solution.leetcode;

import java.util.Arrays;

public class KthLargestElementInAnArray {
    public static void main(String[] args) {
        KthLargestElementInAnArray k = new KthLargestElementInAnArray();
        System.out.println(k.findKthLargest(new int[]{3,2,1,5,6,4}, 2)); // 5
        System.out.println(k.findKthLargest(new int[]{3,2,3,1,2,4,5,5,6}, 4)); // 4
    }
    public int findKthLargest(int[] nums, int k) {
        Arrays.sort(nums);
        return nums[nums.length-k];
    }
}
