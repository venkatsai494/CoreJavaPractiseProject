package solution.leetcode;

import java.util.Arrays;

public class ApplyOperationsToAnArray {
    public static void main(String[] args) {
        ApplyOperationsToAnArray applyOperationsToAnArray = new ApplyOperationsToAnArray();
        System.out.println(Arrays.toString(applyOperationsToAnArray.applyOperations(new int[]{1,2,2,1,1,0})));
        System.out.println(Arrays.toString(applyOperationsToAnArray.applyOperations(new int[]{0,1})));
    }
    public int[] applyOperations(int[] nums) {
        int[] result = new int[nums.length];
        for(int i = 0; i < nums.length-1; i++){
            if(nums[i]==nums[i+1]){
                nums[i]=nums[i]*2;
                nums[i+1]=0;
            }
        }
        int indexOfNums = 0;
        int indexOfResults = 0;
        while(indexOfNums<nums.length){
            if(nums[indexOfNums]!=0){
                result[indexOfResults]=nums[indexOfNums];
                indexOfResults++;
            }
            indexOfNums++;
        }
        return result;
    }
}
