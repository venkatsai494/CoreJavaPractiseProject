package solution.leetcode;

public class LongestFibonacciSubarray {
    public static void main(String[] args) {
        LongestFibonacciSubarray longestFibonacciSubarray = new LongestFibonacciSubarray();
        System.out.println(longestFibonacciSubarray.longestSubarray(new int[]{1,2,3,4,5,6,7,8}));
        System.out.println(longestFibonacciSubarray.longestSubarray(new int[]{1,3,4,7,11,18}));
        System.out.println(longestFibonacciSubarray.longestSubarray(new int[]{1,2,3,5,8}));
        System.out.println(longestFibonacciSubarray.longestSubarray(new int[]{1,1,1,1,2,3,5,1}));
        System.out.println(longestFibonacciSubarray.longestSubarray(new int[]{5,2,7,9,16}));
        System.out.println(longestFibonacciSubarray.longestSubarray(new int[]{1000000000,1000000000,1000000000}));
    }
    public int longestSubarray(int[] nums) {
        int result = 0;
        int count = 2;
        for(int i = 2; i<nums.length; i++){
            if(nums[i] == (nums[i-1]+nums[i-2])){
                count++;
            }
            else{
                count = 2;
            }
            result = Math.max(count, result);
        }
        return result;
    }
}
