package solution.leetcode;

import java.util.Arrays;

public class PartitionArraySuchThatMaximumDifferenceIsK {
    public static void main(String[] args) {
        PartitionArraySuchThatMaximumDifferenceIsK solution = new PartitionArraySuchThatMaximumDifferenceIsK();
        System.out.println(solution.partitionArray(new int[]{3,6,1,2,5}, 2));
        System.out.println(solution.partitionArray(new int[]{1,2,3}, 1));
        System.out.println(solution.partitionArray(new int[]{2,2,4,5}, 0));
    }
    public int partitionArray(int[] nums, int k) {
        if(nums.length == 1) return 1;
        int count = 0;
        Arrays.sort(nums);
        int min = nums[0];
        for(int i = 1; i < nums.length; i++){
            if(nums[i] - min > k){
                min = nums[i];
                count++;
            }
        }
        return ++count;
    }
}
