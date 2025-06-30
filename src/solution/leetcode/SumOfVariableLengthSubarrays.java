package solution.leetcode;

public class SumOfVariableLengthSubarrays {

    public static void main(String[] args) {
        SumOfVariableLengthSubarrays svls = new SumOfVariableLengthSubarrays();
        System.out.println(svls.subarraySum(new int[]{1,2,3})); // 10
        System.out.println(svls.subarraySum(new int[]{1,2,3,4})); // 20
        System.out.println(svls.subarraySum(new int[]{1,2,3,4,5})); // 35
        System.out.println(svls.subarraySum(new int[]{2,3,1})); // 11
        System.out.println(svls.subarraySum(new int[]{3,1,1,2})); // 13
    }

    public int subarraySum(int[] nums) {
        int result = nums[0];
        int start;
        for(int i = 1; i<nums.length; i++){
            start = Math.max(0, i - nums[i]);
            int temp = 0;
            for(int j = start; j<=i; j++){
                temp = temp + nums[j];
            }
            result = result + temp;
        }
        return result;
    }


}
