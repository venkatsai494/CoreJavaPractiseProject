package solution.leetcode;

import java.util.Arrays;

public class CountNumberOfDistinctIntegersAfterReverseOperations {
    public static void main(String[] args) {
        CountNumberOfDistinctIntegersAfterReverseOperations solution = new CountNumberOfDistinctIntegersAfterReverseOperations();
        System.out.println(solution.countDistinctIntegers(new int[]{1, 13, 10, 12, 31})); // Output: 6
        System.out.println(solution.countDistinctIntegers(new int[]{2, 2, 2})); // Output: 1
        System.out.println(solution.countDistinctIntegers(new int[]{100, 200, 300})); // Output: 6
    }
    public int countDistinctIntegers(int[] nums) {
        int[] temp = new int[nums.length*2];
        for(int i = 0; i<nums.length; i++){
            temp[i] = nums[i];
        }
        for(int i = nums.length; i<temp.length; i++){
            temp[i] = reverseInteger(nums[i-nums.length]);
        }
        return (int)Arrays.stream(temp).distinct().count();
    }
    public int reverseInteger(int k){
        int result = 0;
        while(k>0){
            result = (result*10) + k%10;
            k = k/10;
        }
        return result;
    }
}
