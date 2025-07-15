package solution.leetcode;

public class MinimumOperationsToMakeBinaryArrayElementsEqualToOneI {
    public static void main(String[] args) {
        MinimumOperationsToMakeBinaryArrayElementsEqualToOneI solution = new MinimumOperationsToMakeBinaryArrayElementsEqualToOneI();
        System.out.println(solution.minOperations(new int[]{0,1,1,1,0,0}));
        System.out.println(solution.minOperations(new int[]{0,1,1,1}));
        System.out.println(solution.minOperations(new int[]{0, 0, 0}));
    }

    public int minOperations(int[] nums) {
        int count = 0;
        for(int i = 0; i<nums.length-2; i++){
            if(nums[i] == 0){
                nums[i] = 1 - nums[i];
                nums[i+1] = 1 - nums[i+1];
                nums[i+2] = 1 - nums[i+2];
                count++;
            }
        }
        for(int num: nums){
            if(num==0) return -1;
        }
        return count;
    }
}
