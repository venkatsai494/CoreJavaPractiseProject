package solution.leetcode;

import java.util.Arrays;

public class FindTheIntegerAddedToArrayI {
    public static void main(String[] args) {
        FindTheIntegerAddedToArrayI f = new FindTheIntegerAddedToArrayI();
        System.out.println(f.addedInteger(new int[]{2,6,4}, new int[]{9,7,5}));
        System.out.println(f.addedInteger(new int[]{10}, new int[]{5}));
        System.out.println(f.addedInteger(new int[]{1,1,1,1}, new int[]{1,1,1,1}));
    }

    public int addedInteger(int[] nums1, int[] nums2) {
        int min1 = minOfArray(nums1);
        int min2 = minOfArray(nums2);
        return min2 - min1;
    }
    public int minOfArray(int [] nums){
        int min = nums[0];
        for(int i = 0; i<nums.length; i++){
            if(nums[i]<min){
                min = nums[i];
            }
        }
        return min;
    }
}
