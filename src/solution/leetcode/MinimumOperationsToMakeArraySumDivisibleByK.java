package solution.leetcode;

public class MinimumOperationsToMakeArraySumDivisibleByK {
    public static void main(String[] args) {
        MinimumOperationsToMakeArraySumDivisibleByK mo = new MinimumOperationsToMakeArraySumDivisibleByK();
        System.out.println(mo.minOperations(new int[]{3,9,7},5));
        System.out.println(mo.minOperations(new int[]{4,1,3},4));
    }
    public int minOperations(int[] nums, int k) {
        int sum = 0;
        for(int num: nums){
            sum += num;
        }
        return (sum%k);
    }
}
