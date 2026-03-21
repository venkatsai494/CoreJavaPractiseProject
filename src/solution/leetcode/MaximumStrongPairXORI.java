package solution.leetcode;

public class MaximumStrongPairXORI {
    public static void main(String[] args) {
        MaximumStrongPairXORI maximumStrongPairXORI = new MaximumStrongPairXORI();
        System.out.println(maximumStrongPairXORI.maximumStrongPairXor(new int[]{1,2,3,4,5}));
        System.out.println(maximumStrongPairXORI.maximumStrongPairXor(new int[]{10,100}));
        System.out.println(maximumStrongPairXORI.maximumStrongPairXor(new int[]{5,6,25,30}));
    }
    public int maximumStrongPairXor(int[] nums) {
        int result = 0;
        for(int i = 0; i<nums.length; i++){
            for(int j = i; j<nums.length; j++){
                if(Math.abs(nums[i]-nums[j])<=Math.min(nums[i],nums[j])) {
                    result = Math.max(result, nums[i] ^ nums[j]);
                }
            }
        }
        return result;
    }
}
