package solution.leetcode;

public class MinimumOperationsToMakeTheArrayIncreasing {
    public static void main(String[] args) {
        MinimumOperationsToMakeTheArrayIncreasing mo = new MinimumOperationsToMakeTheArrayIncreasing();
        System.out.println(mo.minOperations(new int[]{1,5,2,4,1}));
        System.out.println(mo.minOperations(new int[]{1,1,1}));
        System.out.println(mo.minOperations(new int[]{3,2,1}));
        System.out.println(mo.minOperations(new int[]{8}));
    }
    public int minOperations(int[] nums) {
        int output = 0;
        int temp = 0;
        for(int i = 0; i<nums.length; i++){
            if(temp<nums[i]){
                temp = nums[i];
            }
            else if(temp>nums[i]){
                output = output + (temp - nums[i] + 1);
                temp++;
            }
            else{
                temp = ++nums[i];
                output++;
            }
        }
        return output;
    }
}
