package solution.leetcode;

public class LargestPositiveIntegerThatExistsWithItsNegative {
    public static void main(String[] args) {
        LargestPositiveIntegerThatExistsWithItsNegative lp = new LargestPositiveIntegerThatExistsWithItsNegative();
        System.out.println(lp.findMaxK(new int[]{-1,2,-3,3})); // 3
        System.out.println(lp.findMaxK(new int[]{-1,10,6,7,-7,1})); // 7
        System.out.println(lp.findMaxK(new int[]{-10,8,6,7,-2,-3})); // -1
        System.out.println(lp.findMaxK(new int[]{3, -2, 1, -3})); // 3
        System.out.println(lp.findMaxK(new int[]{-1, 2, -3, 3})); // 3
        System.out.println(lp.findMaxK(new int[]{-1, -2, -3})); // -1
        System.out.println(lp.findMaxK(new int[]{1, 2, 3})); // -1
    }
    public int findMaxK(int[] nums) {
        int max = -1;
        for(int i = 0; i <nums.length; i++){
            for(int j = i+1; j< nums.length; j++){
                if(nums[i] + nums[j] == 0) max = Math.max(max, Math.abs(nums[i]));
            }
        }
        return max;
    }
}
