package solution.leetcode;

import java.util.Arrays;

public class NeitherMinimumNorMaximum {
    public static void main(String[] args) {
        NeitherMinimumNorMaximum nmnm = new NeitherMinimumNorMaximum();
        System.out.println(nmnm.findNonMinOrMax(new int[]{3, 2, 1, 4}));
        System.out.println(nmnm.findNonMinOrMax(new int[]{1,2}));
        System.out.println(nmnm.findNonMinOrMax(new int[]{2,1,3}));
    }
    public int findNonMinOrMax(int[] nums) {
        if(nums.length<=2)  return -1;
        Arrays.sort(nums);
        return nums[1];
    }
}
