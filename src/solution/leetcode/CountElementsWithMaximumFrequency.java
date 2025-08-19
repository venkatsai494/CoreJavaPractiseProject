package solution.leetcode;

import java.util.Arrays;

public class CountElementsWithMaximumFrequency {
    public static void main(String[] args) {
        CountElementsWithMaximumFrequency cemf = new CountElementsWithMaximumFrequency();
        System.out.println(cemf.maxFrequencyElements(new int[]{1, 2, 2, 3, 3, 3, 4})); // Output: 3
        System.out.println(cemf.maxFrequencyElements(new int[]{1,2,2,3,1,4})); // Output: 4
        System.out.println(cemf.maxFrequencyElements(new int[]{1,2,3,4,5})); // Output: 5
    }
    public int maxFrequencyElements(int[] nums) {
        Arrays.sort(nums);
        int freq = 1;
        int maxFreq = 1;
        int multiplier = 1;
        for(int i = 1; i<nums.length; i++){
            if(nums[i]==nums[i-1]){
                freq++;
            }
            else{
                freq = 1;
            }
            if(freq>maxFreq){
                maxFreq = freq;
                multiplier = 1;
            }
            else if(freq == maxFreq){
                multiplier++;
            }
        }
        return maxFreq*multiplier;
    }
}
