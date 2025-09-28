package solution.leetcode;

import java.util.Arrays;

public class LargestPerimeterTriangle {
    public static void main(String[] args) {
        LargestPerimeterTriangle solution = new LargestPerimeterTriangle();
        System.out.println(solution.largestPerimeter(new int[]{2,1,2})); // Output: 5
        System.out.println(solution.largestPerimeter(new int[]{1,2,1})); // Output: 0
        System.out.println(solution.largestPerimeter(new int[]{3,2,3,4})); // Output: 10
        System.out.println(solution.largestPerimeter(new int[]{3,6,2,3})); // Output: 8
    }
    public int largestPerimeter(int[] nums) {
        int length = nums.length;
        Arrays.sort(nums);
        for(int i = length-1; i>=2; i--){
            if(nums[i-1]+nums[i-2]>nums[i]){
                return nums[i]+nums[i-1]+nums[i-2];
            }
        }
        return 0;
    }
}
