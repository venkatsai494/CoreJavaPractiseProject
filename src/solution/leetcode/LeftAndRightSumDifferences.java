package solution.leetcode;
import java.util.Arrays;

public class LeftAndRightSumDifferences {

    public static void main(String[] args) {
        LeftAndRightSumDifferences lrsd = new LeftAndRightSumDifferences();
        int[] nums = {10,4,8,3};
        int[] result = lrsd.leftRightDifference(nums);
        for(int i = 0; i<result.length; i++){
            System.out.println(result[i]);
        }
    }
    public int[] leftRightDifference(int[] nums) {
        int [] result = new int[nums.length];;
        int[] leftSum = new int[nums.length];
        int[] rightSum = new int[nums.length];
        leftSum[0] = 0;
        rightSum[rightSum.length - 1] = 0;
        int temp = 0;
        for(int i = 1; i<leftSum.length; i++){
            for(int j = 0; j < i; j++){
                temp = temp + nums[j];
            }
            leftSum[i] = temp;
            temp = 0;
        }

        for(int i = 0; i<rightSum.length-1; i++){
            for(int j = i+1; j < rightSum.length; j++){
                temp = temp + nums[j];
            }
            rightSum[i] = temp;
            temp = 0;
        }

        for(int i =0; i<nums.length; i++){
            result[i] = Math.abs(leftSum[i] - rightSum[i]);
        }
        System.out.println("Left Sum" + Arrays.toString(leftSum));
        System.out.println("Left Sum" + Arrays.toString(rightSum));
        return result;
    }
}
