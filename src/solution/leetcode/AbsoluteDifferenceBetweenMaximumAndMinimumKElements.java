package solution.leetcode;

import java.util.Arrays;

public class AbsoluteDifferenceBetweenMaximumAndMinimumKElements {
    public static void main(String[] args) {
        AbsoluteDifferenceBetweenMaximumAndMinimumKElements solution = new AbsoluteDifferenceBetweenMaximumAndMinimumKElements();
        System.out.println(solution.absDifference(new int[]{1,3,5,7,9}, 2)); // Output: 12
        System.out.println(solution.absDifference(new int[]{3,3,3,3,3}, 3)); // Output: 0
    }
    public int absDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int max = 0;
        for(int i = nums.length-k; i<nums.length; i++){
            max = max + nums[i];
        }
        int min = 0;
        for(int i = 0; i<k; i++){
            min = min + nums[i];
        }
        return max-min;
    }
}
