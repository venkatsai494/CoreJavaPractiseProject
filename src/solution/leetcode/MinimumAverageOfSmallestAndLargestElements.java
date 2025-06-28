package solution.leetcode;

import java.util.Arrays;

public class MinimumAverageOfSmallestAndLargestElements {
    public static void main(String[] args) {
        MinimumAverageOfSmallestAndLargestElements m = new MinimumAverageOfSmallestAndLargestElements();
        System.out.println(m.minimumAverage(new int[]{7,8,3,4,15,13,4,1})); // Output: 5.5
        System.out.println(m.minimumAverage(new int[]{1,9,8,3,10,5})); // Output: 5.5
        System.out.println(m.minimumAverage(new int[]{1,2,3,7,8,9})); // Output: 5.0
    }
    public double minimumAverage(int[] nums) {
        Arrays.sort(nums);
        int i = 0;
        int j = nums.length-1;
        double min = nums[i]+nums[j]/2.0;
        while(i<j){
            min = Math.min(min, (nums[i]+nums[j])/2.0);
            i++;
            j--;
        }
        return min;
    }
}
