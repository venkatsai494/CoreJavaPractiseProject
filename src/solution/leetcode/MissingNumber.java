package solution.leetcode;

import java.util.Arrays;

public class MissingNumber {
    public static void main(String[] args) {
        MissingNumber mn = new MissingNumber();
        System.out.println(mn.missingNumber(new int[]{3, 0, 1}));
        System.out.println(mn.missingNumber(new int[]{0, 1}));
        System.out.println(mn.missingNumber(new int[]{9,6,4,2,3,5,7,0,1}));
        System.out.println(mn.missingNumber(new int[]{9,6,4,2,3,5}));
    }
    public int missingNumber(int[] nums) {
        Arrays.sort(nums);{
            for(int i = 0; i<nums.length; i++){
                if(i!=nums[i]) return i;
            }
        }
        return nums.length;
    }
}
