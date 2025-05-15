package solution.leetcode;

public class MaxConsecutiveOnes {
    public static void main(String[] args) {
        MaxConsecutiveOnes mco = new MaxConsecutiveOnes();
        System.out.println(mco.findMaxConsecutiveOnes(new int[]{1,1,0,1,1,1})); // 3
        System.out.println(mco.findMaxConsecutiveOnes(new int[]{1,0,1,1,0,1})); // 2
        System.out.println(mco.findMaxConsecutiveOnes(new int[]{0,0,0})); // 0
        System.out.println(mco.findMaxConsecutiveOnes(new int[]{1,1,1})); // 3
    }
    public int findMaxConsecutiveOnes(int[] nums) {
        int count = 0;
        int max = 0;
        for(int i = 0; i<nums.length; i++){
            if(nums[i] == 1) count++;
            else if(nums[i] == 0) count = 0;
            max = Math.max(max, count);
        }
        return max;
    }
}
