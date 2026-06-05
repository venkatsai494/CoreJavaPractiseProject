package solution.leetcode;
import java.util.Arrays;

public class ConcatenateArrayWithReverse {
    public static void main(String[] args) {
        ConcatenateArrayWithReverse solution = new ConcatenateArrayWithReverse();
        System.out.println(Arrays.toString(solution.concatWithReverse(new int[]{1,2,3})));
        System.out.println(Arrays.toString(solution.concatWithReverse(new int[]{1})));
    }
    public int[] concatWithReverse(int[] nums) {
        int [] result = new int[nums.length*2];
        System.arraycopy(nums, 0, result, 0, nums.length);
        for(int i = nums.length; i<result.length; i++){
            result[i] = result[result.length-1-i];
        }
        return result;
    }
}
