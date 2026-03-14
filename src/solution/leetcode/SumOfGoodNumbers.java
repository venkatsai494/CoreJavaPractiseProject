package solution.leetcode;

public class SumOfGoodNumbers {
    public static void main(String[] args) {
        SumOfGoodNumbers sumOfGoodNumbers = new SumOfGoodNumbers();
        System.out.println(sumOfGoodNumbers.sumOfGoodNumbers(new int[]{1,3,2,1,5,4}, 2));
        System.out.println(sumOfGoodNumbers.sumOfGoodNumbers(new int[]{2,1}, 1));
        System.out.println(sumOfGoodNumbers.sumOfGoodNumbers(new int[]{1,2,3,4}, 2));
        System.out.println(sumOfGoodNumbers.sumOfGoodNumbers(new int[]{2,7,1,19,18}, 3));
        System.out.println(sumOfGoodNumbers.sumOfGoodNumbers(new int[]{1,2,3}, 1));
    }
    public int sumOfGoodNumbers(int[] nums, int k) {
        int sum = 0;
        int l = nums.length;
        for(int i = 0; i<nums.length; i++){
            int leftmax = i-k>=0?nums[i-k]:0;
            int rightmax = i+k<l?nums[i+k]:0;
            if(nums[i]>leftmax && nums[i]>rightmax){
                sum += nums[i];
            }
        }
        return sum;
    }
}
